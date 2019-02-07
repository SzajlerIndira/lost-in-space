package com.codecool.lostinspace.entity;

public class Property {
    private int id;
    private static int idCounter = 0;
    private int price;
    private int size;
    private Planet planet;


    public Property( int price, int size, Planet planet) {
        idCounter++;
        this.id = idCounter;
        this.price = price;
        this.size = size;
        this.planet = planet;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Property{" +
                "id=" + id +
                ", price=" + price +
                ", size=" + size +
                ", planet=" + planet +
                '}';
    }

    public Planet getPlanet() {
        return this.planet;
    }
}
