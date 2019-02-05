package com.codecool.lostinspace.entity;

public class Planet {
    private String name;
    private double availableLandspace;
    private final double totalLandspace;

    public Planet(String name, Double totalLandspace) {
        this.name = name;
        this.totalLandspace = totalLandspace;


    }

    public String getName() {
        return name;
    }

    public void reduceAvailableLandspace(int sizeToRemove) {
        availableLandspace -= sizeToRemove;

    }

    public void setAvailableLandscape(int totalPropertySize) {
        this.availableLandspace=totalLandspace-totalPropertySize;
    }
}
