package com.vauhtio.bo;

public class VauhtioData {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "VauhtioData: {name = "+ name + "}";
    }
}
