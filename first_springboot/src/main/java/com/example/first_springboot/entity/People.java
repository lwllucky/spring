package com.example.first_springboot.entity;

/**
 * @auter liwinallucky
 */
public class People {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSge() {
        return sge;
    }

    public void setSge(int sge) {
        this.sge = sge;
    }

    private int sge;
}
