/*
 * Copyright 2014 Miroslav Jaros
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package asistantguitest

import ServerMultipleThreads.SocketThread
import org.json.simple.JSONObject
import util.ImplementationOfInterface

import java.beans.PropertyChangeEvent
import java.beans.PropertyChangeListener


/**
 * The controller for manage of views actions and events
 *
 */
class AsistantGuiTestController {
    // these will be injected by Griffon
    def model
    def view

    private def socketThread = null

    private def tabInterface = null

    @Override
    void mvcGroupInit(Map args) {
        tabInterface = args['tabInt']

    }

    def startAction = { evt = null ->
        if (socketThread != null) return
        log.info 'Starting server'
        socketThread = new SocketThread([propertyChange: { PropertyChangeEvent e ->
            log.info "New json obtained ${e.newValue.get('no')}"
            execInsideUIAsync {
                model.jsons.add e.newValue
            }
        }
        ] as PropertyChangeListener, tabInterface)
        socketThread.start()
    }

    def testProperty = { evt = null ->
        JSONObject o = new JSONObject(['no': '123', 'breed': 'PER',
                'mark': 'Excellent', 'rank': '1', 'note': 'nic'])
        execInsideUIAsync {
            model.jsons.add(o)
        }
    }
}
