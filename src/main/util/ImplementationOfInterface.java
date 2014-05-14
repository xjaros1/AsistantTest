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

package util;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import ServerMultipleThreads.ServerInterface;

public class ImplementationOfInterface implements ServerInterface {

    private JSONObject cats;

    public ImplementationOfInterface() {
        cats = setCats();
    }


    @Override
    public JSONObject getCats() {
        return cats;
    }

    public JSONObject setCats() {
        JSONObject c1 = new JSONObject();
        c1.put("no", "1");
        c1.put("breed", "PER");
        c1.put("ems", "d 03 22");
        c1.put("class", "12");
        c1.put("sex", "01");
        c1.put("born", "19.3.2012");
        c1.put("type", "");
        c1.put("head", "");
        c1.put("eyes", "");
        c1.put("ears", "");
        c1.put("coat", "");
        c1.put("tail", "");
        c1.put("condition", "");
        c1.put("impress", "");
        c1.put("comment", "");
        c1.put("mark", "");
        c1.put("rank", "");
        c1.put("biv", "false");
        c1.put("nomination", "false");
        c1.put("note", "");
        c1.put("title", "");
        c1.put("reason", "");

        JSONObject c2 = new JSONObject();
        c2.put("no", "2");
        c2.put("breed", "EXO");
        c2.put("ems", "g 03 22)");
        c2.put("class", "7");
        c2.put("sex", "01");
        c2.put("born", "23.1.2011");
        c2.put("type", "");
        c2.put("head", "");
        c2.put("eyes", "");
        c2.put("ears", "");
        c2.put("coat", "");
        c2.put("tail", "");
        c2.put("condition", "");
        c2.put("impress", "");
        c2.put("comment", "");
        c2.put("mark", "");
        c2.put("rank", "");
        c2.put("biv", "false");
        c2.put("nomination", "false");
        c2.put("note", "");
        c2.put("title", "");
        c2.put("reason", "");

        JSONObject c3 = new JSONObject();
        c3.put("no", "5");
        c3.put("breed", "MCO");
        c3.put("ems", "GR 3(n 22)");
        c3.put("class", "2");
        c3.put("sex", "01");
        c3.put("born", "23.1.2011");
        c3.put("type", "");
        c3.put("head", "");
        c3.put("eyes", "");
        c3.put("ears", "");
        c3.put("coat", "");
        c3.put("tail", "");
        c3.put("condition", "");
        c3.put("impress", "");
        c3.put("comment", "");
        c3.put("mark", "");
        c3.put("rank", "");
        c3.put("biv", "false");
        c3.put("nomination", "false");
        c3.put("note", "");
        c3.put("title", "");
        c3.put("reason", "");

        JSONObject c4 = new JSONObject();
        c4.put("no", "8");
        c4.put("breed", "MCO");
        c4.put("ems", "f(22)");
        c4.put("class", "14");
        c4.put("sex", "01");
        c4.put("born", "23.1.2011");
        c4.put("type", "");
        c4.put("head", "");
        c4.put("eyes", "");
        c4.put("ears", "");
        c4.put("coat", "");
        c4.put("tail", "");
        c4.put("condition", "");
        c4.put("impress", "");
        c4.put("comment", "");
        c4.put("mark", "");
        c4.put("rank", "");
        c4.put("biv", "false");
        c4.put("nomination", "false");
        c4.put("note", "");
        c4.put("title", "");
        c4.put("reason", "");

        JSONObject c5 = new JSONObject();
        c5.put("no", "10");
        c5.put("breed", "MCO");
        c5.put("ems", "f(22)");
        c5.put("class", "14");
        c5.put("sex", "01");
        c5.put("born", "23.1.2011");
        c5.put("type", "");
        c5.put("head", "");
        c5.put("eyes", "");
        c5.put("ears", "");
        c5.put("coat", "");
        c5.put("tail", "");
        c5.put("condition", "");
        c5.put("impress", "");
        c5.put("comment", "");
        c5.put("mark", "");
        c5.put("rank", "");
        c5.put("biv", "false");
        c5.put("nomination", "false");
        c5.put("note", "");
        c5.put("title", "");
        c5.put("reason", "");

        JSONObject c6 = new JSONObject();
        c6.put("no", "11");
        c6.put("breed", "MCO");
        c6.put("ems", "f(22)");
        c6.put("class", "14");
        c6.put("sex", "01");
        c6.put("born", "23.1.2011");
        c6.put("type", "");
        c6.put("head", "");
        c6.put("eyes", "");
        c6.put("ears", "");
        c6.put("coat", "");
        c6.put("tail", "");
        c6.put("condition", "");
        c6.put("impress", "");
        c6.put("comment", "");
        c6.put("mark", "");
        c6.put("rank", "");
        c6.put("biv", "false");
        c6.put("nomination", "false");
        c6.put("note", "");
        c6.put("title", "");
        c6.put("reason", "");

        JSONObject c7 = new JSONObject();
        c7.put("no", "21");
        c7.put("breed", "MCO");
        c7.put("ems", "f(22)");
        c7.put("class", "14");
        c7.put("sex", "01");
        c7.put("born", "23.1.2011");
        c7.put("type", "");
        c7.put("head", "");
        c7.put("eyes", "");
        c7.put("ears", "");
        c7.put("coat", "");
        c7.put("tail", "");
        c7.put("condition", "");
        c7.put("impress", "");
        c7.put("comment", "");
        c7.put("mark", "");
        c7.put("rank", "");
        c7.put("biv", "false");
        c7.put("nomination", "false");
        c7.put("note", "");
        c7.put("title", "");
        c7.put("reason", "");

        JSONObject c8 = new JSONObject();
        c8.put("no", "30");
        c8.put("breed", "MCO");
        c8.put("ems", "f(22)");
        c8.put("class", "14");
        c8.put("sex", "01");
        c8.put("born", "23.1.2011");
        c8.put("type", "");
        c8.put("head", "");
        c8.put("eyes", "");
        c8.put("ears", "");
        c8.put("coat", "");
        c8.put("tail", "");
        c8.put("condition", "");
        c8.put("impress", "");
        c8.put("comment", "");
        c8.put("mark", "");
        c8.put("rank", "");
        c8.put("biv", "false");
        c8.put("nomination", "false");
        c8.put("note", "");
        c8.put("title", "");
        c8.put("reason", "");

        JSONObject c9 = new JSONObject();
        c9.put("no", "4");
        c9.put("breed", "MCO");
        c9.put("ems", "f(22)");
        c9.put("class", "14");
        c9.put("sex", "01");
        c9.put("born", "23.1.2011");
        c9.put("type", "");
        c9.put("head", "");
        c9.put("eyes", "");
        c9.put("ears", "");
        c9.put("coat", "");
        c9.put("tail", "");
        c9.put("condition", "");
        c9.put("impress", "");
        c9.put("comment", "");
        c9.put("mark", "");
        c9.put("rank", "");
        c9.put("biv", "false");
        c9.put("nomination", "false");
        c9.put("note", "");
        c9.put("title", "");
        c9.put("reason", "");

        JSONObject c10 = new JSONObject();
        c10.put("no", "32");
        c10.put("breed", "MCO");
        c10.put("ems", "f(22)");
        c10.put("class", "14");
        c10.put("sex", "01");
        c10.put("born", "23.1.2011");
        c10.put("type", "");
        c10.put("head", "");
        c10.put("eyes", "");
        c10.put("ears", "");
        c10.put("coat", "");
        c10.put("tail", "");
        c10.put("condition", "");
        c10.put("impress", "");
        c10.put("comment", "");
        c10.put("mark", "");
        c10.put("rank", "");
        c10.put("biv", "false");
        c10.put("nomination", "false");
        c10.put("note", "");
        c10.put("title", "");
        c10.put("reason", "");

        JSONObject c11 = new JSONObject();
        c11.put("no", "33");
        c11.put("breed", "MCO");
        c11.put("ems", "f(22)");
        c11.put("class", "14");
        c11.put("sex", "01");
        c11.put("born", "23.1.2011");
        c11.put("type", "");
        c11.put("head", "");
        c11.put("eyes", "");
        c11.put("ears", "");
        c11.put("coat", "");
        c11.put("tail", "");
        c11.put("condition", "");
        c11.put("impress", "");
        c11.put("comment", "");
        c11.put("mark", "");
        c11.put("rank", "");
        c11.put("biv", "false");
        c11.put("nomination", "false");
        c11.put("note", "");
        c11.put("title", "");
        c11.put("reason", "");

        JSONObject c12 = new JSONObject();
        c12.put("no", "14");
        c12.put("breed", "MCO");
        c12.put("ems", "f(22)");
        c12.put("class", "14");
        c12.put("sex", "01");
        c12.put("born", "23.1.2011");
        c12.put("type", "");
        c12.put("head", "");
        c12.put("eyes", "");
        c12.put("ears", "");
        c12.put("coat", "");
        c12.put("tail", "");
        c12.put("condition", "");
        c12.put("impress", "");
        c12.put("comment", "");
        c12.put("mark", "");
        c12.put("rank", "");
        c12.put("biv", "false");
        c12.put("nomination", "false");
        c12.put("note", "");
        c12.put("title", "");
        c12.put("reason", "");

        JSONObject c13 = new JSONObject();
        c13.put("no", "20");
        c13.put("breed", "MCO");
        c13.put("ems", "f(22)");
        c13.put("class", "14");
        c13.put("sex", "01");
        c13.put("born", "23.1.2011");
        c13.put("type", "");
        c13.put("head", "");
        c13.put("eyes", "");
        c13.put("ears", "");
        c13.put("coat", "");
        c13.put("tail", "");
        c13.put("condition", "");
        c13.put("impress", "");
        c13.put("comment", "");
        c13.put("mark", "");
        c13.put("rank", "");
        c13.put("biv", "false");
        c13.put("nomination", "false");
        c13.put("note", "");
        c13.put("title", "");
        c13.put("reason", "");

        JSONArray a1 = new JSONArray();
        a1.add(c1);
        a1.add(c2);
        a1.add(c3);
        a1.add(c4);
        a1.add(c5);
        a1.add(c6);
        a1.add(c7);
        a1.add(c8);
        a1.add(c9);
        a1.add(c10);

        JSONArray a2 = new JSONArray();
        a2.add(c11);
        a2.add(c12);
        a2.add(c13);

        JSONObject cats = new JSONObject();
        cats.put("Adam Barta", a1);
        cats.put("Ben Jury", a2);

        return cats;
    }

}
