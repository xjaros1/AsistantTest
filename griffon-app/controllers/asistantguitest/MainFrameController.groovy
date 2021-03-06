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

import asistantguitest.domain.Cat
import asistantguitest.domain.Entry
import asistantguitest.domain.Judge
import ca.odell.glazedlists.EventList
import org.codehaus.groovy.grails.orm.hibernate.SessionFactoryProxy
import util.ServerInterfaceBuilder

class MainFrameController {
    // these will be injected by Griffon
    def model
    def view

    void mvcGroupInit(Map args) {
        execOutsideUI {
            def x = Judge.list()
            def y = Cat.list()
            def z = Entry.list()
            log.warn "Size:\t Judge: ${x.size()} \n \tCat: ${y.size()} \n \tEntry: ${z.size()}"
            execInsideUIAsync {
                model.cats.addAll y
                model.judges.addAll x
                model.entries.addAll z
            }
        }
    }

    // void mvcGroupDestroy() {
    //    // this method is called when the group is destroyed
    // }

    /*
        Remember that actions will be called outside of the UI thread
        by default. You can change this setting of course.
        Please read chapter 9 of the Griffon Guide to know more.
       
    def action = { evt = null ->
    }
    */

    def addCatAction = { evt = null ->
        log.info 'Action started'
        def f = new Cat(name: view.catsName.text, breed: view.catsBreed.text,
                ems: view.catsEms.text, sex: view.catsSex.text, born: view.catsBorn.text)
        f.save()
        execInsideUIAsync {

            def y = model.cats.find { it.id == f.id }
            if (y != null) model.cats.remove(y)
            model.cats.add f
            view.catsName.text = ''
            view.catsBreed.text = ''
            view.catsEms.text = ''
            view.catsSex.text = ''
            view.catsSex.text = ''
            view.catsBorn.text = ''
        }
    }


    def addJudgeAction = { evt = null ->
        def x = new Judge(name: view.judgeName.text)
        x.save()
        execInsideUIAsync {
            model.judges.add x
            view.judgeName.text = ''
        }
    }
    def generateEntriesAction = { evt = null ->
        log.info 'Ehlo'
        def x = new ArrayList<Cat>()

        execInsideUISync {
            log.warn "${model.cats}"
            x.addAll model.cats
        }
        log.info("${x.size()}")
        def y = new ArrayList<Entry>()
        int no = 0
        x.each { value ->
            def e = new Entry(described: value, no: no++ as String)
            e.save()
            log.warn e.errors.fieldError.toString()
            y.push(e)
        }
        Entry.withSession { session ->
            session.flush()
        }

        execInsideUIAsync {
            model.entries.addAll y
        }
    }
    def startTabletAction = { evt = null ->
        ServerInterfaceBuilder sb = new ServerInterfaceBuilder(new ArrayList<Judge>(model.judges))
        buildMVCGroup('asistantGuiTest', ['tabGroup': view.MainTabbedPane,
                'tabInt': sb.buildInterface()])
    }

    def saveAllAction = { evt = null ->
        log.info 'Saving entires'
        model.entries.each { val ->
            val.save()
        }
    }

    def deleteAllEntriesAction = { evt = null ->
        def x = Entry.list()
        x.each { val ->
            val.delete()
        }
        Entry.withSession { session ->
            session.flush()
        }
        execInsideUIAsync {
            model.entries.clear()
        }
    }

    def deleteJudgesAction = { evt = null ->
        def x = Judge.list()
        x.each { val ->
            val.delete()
        }
        Judge.withSession { session ->
            session.flush()
        }
        execInsideUIAsync {
            model.judges.clear()
        }
    }

    def deleteCatsAction = { evt = null ->
        def x = Cat.list()
        x.each { val ->
            val.delete()
        }
        Cat.withSession { session ->
            session.flush()
        }
        execInsideUIAsync {
            model.cats.clear()
        }
    }

    def onNewEntity = { app ->
        log.debug 'New entity runned'
        def x = Entry.list()
        execInsideUISync {
            model.entries.clear()
            model.entries.addAll x
        }
    }
}
