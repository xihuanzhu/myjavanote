package com.test2.parray;

import java.util.Objects;

public class Room {
    private String id;
    private int level;
    private int empty;

    public Room() {
    }

    public Room(String id, int level, int empty) {
        this.id = id;
        this.level = level;
        this.empty = empty;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getEmpty() {
        return empty;
    }

    public void setEmpty(int empty) {
        this.empty = empty;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id='" + id + '\'' +
                ", level=" + level +
                ", empty=" + empty +
                '}';
    }
}
