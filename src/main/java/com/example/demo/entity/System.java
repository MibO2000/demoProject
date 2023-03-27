package com.example.demo.entity;

import java.util.HashMap;

public enum System {
    PRO(new HashMap<String, String>() {{
        put("key1", "value1");
        put("key2", "value2");
    }}),
    BASIC(new HashMap<String, String>() {{
        put("key1", "value1");
        put("key2", "value2");
    }}),
    NORMAL(new HashMap<String, String>() {{
        put("key1", "value1");
        put("key2", "value2");
    }});

    private HashMap<String, String> code;

    System(HashMap<String, String> code) {
        this.code = code;
    }

    public HashMap<String, String> getCode() {
        return code;
    }

    public void setCode(HashMap<String, String> code) {
        this.code = code;
    }
}
