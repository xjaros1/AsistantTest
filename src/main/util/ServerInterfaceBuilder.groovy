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

package util

import ServerMultipleThreads.ServerInterface
import asistantguitest.domain.Entry
import asistantguitest.domain.Judge
import org.json.simple.JSONArray
import org.json.simple.JSONObject

/**
 * Created by mirek on 11.5.14.
 */
class ServerInterfaceBuilder {

    private static def Evars = ['no', 'type', 'head', 'eyes',
            'ears', 'coat', 'tail', 'condition', 'impress', 'comment', 'mark',
            'rank', 'biv', 'nomination', 'note', 'title', 'reason']

    private static def Cvars = ['breed', 'ems', 'sex', 'born']

    JSONObject obj = null;

    static private JSONObject genFromEntry(Entry e) {
        JSONObject res = new JSONObject()
        Evars.each { String s ->
            res.put(s, e."${s}" ?: '')
        }
        Cvars.each { String s ->
            res.put(s, e.described."${s}" ?: '')
        }
        res.put('class', e.catClass ?: '')
        res
    }

    ServerInterfaceBuilder(List<Judge> judges) {
        process(judges)
    }

    private void process(List<Judge> judges) {
        JSONObject res = new JSONObject()
        judges.each { Judge j ->
            JSONArray arr = new JSONArray()
            j.entries.each { Entry e ->
                arr.add(genFromEntry(e))
            }
            res.put(j.name, arr)

        }
        obj = res
    }

    ServerInterface buildInterface() {

        return { -> return obj } as ServerInterface

    }
}
