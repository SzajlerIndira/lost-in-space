package com.codecool.lostinspace.service;

import com.codecool.lostinspace.entity.Planet;
import com.codecool.lostinspace.entity.Property;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class EntityDatabase {
    private static EntityDatabase ourInstance = new EntityDatabase();

    public static EntityDatabase getInstance() {
        return ourInstance;
    }

    private EntityDatabase() {

    }

    private List<Property> properties = new ArrayList<>();
    private List<Planet> planets = new ArrayList<>();


    @Autowired
    private PropertyCreator propertyCreator;


    public List<String> getPlanetNames() {
        List<String> planetNames = new ArrayList<>();

        for (Planet planet : planets) {
            planetNames.add(planet.getName());
        }
        return planetNames;
    }

    public Planet getPlanet(String planetName) {
        Planet searchedPlanet=null;
        for (Planet planet : planets) {
            if (planetName.equals(planet.getName())) {
                searchedPlanet=planet;
            }
        }

        return searchedPlanet;

    }

    public double getTotalPropertySizePerPlanet(Planet planet) {

        double totalPropertySize = 0;
        for (Property property : properties) {
            if (property.getPlanet() == planet) {
                totalPropertySize += property.getSize();
            }
        }
        return totalPropertySize;
    }

    public void addPlanetList(List planets) {
        this.planets = planets;
    }

    public void addProperty(int price, int size, Planet planet) {
        Property property = propertyCreator.createProperty(price, size, planet);
        properties.add(property);
        planet.reduceAvailableLandspace(size);
    }

}
