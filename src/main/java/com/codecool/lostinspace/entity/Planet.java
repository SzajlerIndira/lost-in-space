package com.codecool.lostinspace.entity;

import org.springframework.stereotype.Service;

@Service
public class Planet {
    private String name;
    private double availableLandspace;
    private double totalLandspace;

    public Planet(String name, Double totalLandspace) {
        this.name = name;
        this.totalLandspace = totalLandspace;
        this.availableLandspace = totalLandspace;


    }

    public Planet() {
    }

    public String getName() {
        return name;
    }

    public void reduceAvailableLandspace(int sizeToRemove) {
        availableLandspace -= sizeToRemove;

    }

    public int getAvailableLandspace() {
        return (int) availableLandspace;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", availableLandspace=" + availableLandspace +
                ", totalLandspace=" + totalLandspace +
                '}';
    }

    public void setAvailableLandscape(int totalPropertySize) {
        this.availableLandspace=totalLandspace-totalPropertySize;
    }
}
