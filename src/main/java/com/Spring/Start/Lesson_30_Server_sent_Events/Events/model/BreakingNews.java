package com.Spring.Start.Lesson_30_Server_sent_Events.Events.model;

import lombok.Data;

@Data
public class BreakingNews {
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}

