package com.hit.kwk.dao;

import java.io.Serializable;

public class City implements Serializable{

    private String ID;
    private String name;

    public City() {
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
