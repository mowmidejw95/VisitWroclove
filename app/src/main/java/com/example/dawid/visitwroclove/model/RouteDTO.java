package com.example.dawid.visitwroclove.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dawid on 06.07.2017.
 */

public class RouteDTO {

    private int globalId;
    private int id;
    private String name;
    private String description;
    private String length;
    private List<PointDTO> points = new ArrayList<>();
    private int removed;
    private String type;
    private boolean isMine;
    private int id_local;

    public int getGlobalId() {
        return globalId;
    }

    public void setGlobalId(int globalId) {
        this.globalId = globalId;
    }

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public List<PointDTO> getPoints() {
        return points;
    }

    public void setPoints(List<PointDTO> points) {
        this.points = points;
    }

    public boolean isMine() {
        return isMine;
    }

    public void setMine(boolean mine) {
        isMine = mine;
    }

    public int getId_local() {
        return id_local;
    }

    public void setId_local(int id_local) {
        this.id_local = id_local;
    }

    public int getRemoved() {
        return removed;
    }

    public void setRemoved(int removed) {
        this.removed = removed;
    }

    public String getIcon() {
        return type;
    }

    public void setIcon(String type) {
        this.type = type;
    }
}
