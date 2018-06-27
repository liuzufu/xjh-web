package com.xjh.entity;

import java.io.Serializable;

public class Greeting implements Serializable {

    private final Integer id;
    private final String content;

    public Greeting(int id, String content) {
        this.id = id;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
