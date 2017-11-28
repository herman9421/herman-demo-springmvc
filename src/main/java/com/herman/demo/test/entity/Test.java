package com.herman.demo.test.entity;

import java.io.Serializable;

/**
 * Created by herman on 2017/11/27.
 */
public class Test implements Serializable {

    private static final long serialVersionUID = 3548141054940838581L;

    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
