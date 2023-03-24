package com.demo.entity;

public class Dept {
    private int id;
    private String name;

    public Dept() {
    }

    public Dept(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
