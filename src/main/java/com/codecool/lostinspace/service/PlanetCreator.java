package com.codecool.lostinspace.service;

import com.codecool.lostinspace.entity.Planet;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class PlanetCreator {
    public static Map<String, Double> planetMap = new HashMap<>();

    public void putPlanetsToPlanetMap() {
        planetMap.put("Mercury", (1748*Math.pow(10,5)));
        planetMap.put("Venus", (46*Math.pow(10,7)));
        planetMap.put("Mars", (145*Math.pow(10,6)));
        planetMap.put("Jupiter", (622*Math.pow(10,8)));
        planetMap.put("Saturnus",(427*Math.pow(10,8)));
        planetMap.put("Uranus", (81*Math.pow(10,8)));
        planetMap.put("Neptunus", (764*Math.pow(10,7)));
        planetMap.put("Pluto", (178*Math.pow(10,5)));

    }


    public List<Planet> createPlanetList() {
        putPlanetsToPlanetMap();
        List<Planet> planets = new ArrayList<>();
        for (Map.Entry<String, Double> entry: planetMap.entrySet()) {
           Planet planet = new  Planet(entry.getKey(), entry.getValue());
           planets.add(planet);
        }
        return  planets;
    }

    @Override
    public String toString() {
        return "PlanetCreator{}";
    }
}
