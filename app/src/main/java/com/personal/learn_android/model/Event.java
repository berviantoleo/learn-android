/*
 * Copyright (c) 2017 Bervianto Leo Pratama
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.personal.learn_android.model;

import io.realm.RealmObject;

public class Event extends RealmObject {
    private String event_name;
    private String tanggal_event;
    private Integer image;
    private boolean selected;

    public Event() {
        this.event_name = "Event";
        this.tanggal_event = "01 Januari 2017";
        this.image = -1;
        this.selected = false;
    }

    public Event(String event_name, String tanggal_event, Integer image) {
        this.event_name = event_name;
        this.tanggal_event = tanggal_event;
        this.image = image;
        selected = false;
    }

    public String getEventName() {
        return event_name;
    }

    public void setEventName(String event_name) {
        this.event_name = event_name;
    }

    public String getTanggalEvent() {
        return tanggal_event;
    }

    public void setTanggalEvent(String tanggal_event) {
        this.tanggal_event = tanggal_event;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
}
