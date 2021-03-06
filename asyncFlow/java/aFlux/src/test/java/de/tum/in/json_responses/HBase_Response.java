

/*
 * aFlux: JVM based IoT Mashup Tool
 * Copyright 2019 Tanmaya Mahapatra
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.tum.in.json_responses;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mahapatr on 25/01/17.
 */
public class HBase_Response {
    private List<String> key = new ArrayList<String>();
    private List<String> value = new ArrayList<String>();

    public List<String> getKey() {
        return key;
    }

    public void setKey(List<String> key) {
        this.key = key;
    }

    public List<String> getValue() {
        return value;
    }

    public void setValue(List<String> value) {
        this.value = value;
    }

    public void addkey(String key) {
        this.key.add(key);
    }

    public void addvalue(String value) {
        this.value.add(value);
    }
}
