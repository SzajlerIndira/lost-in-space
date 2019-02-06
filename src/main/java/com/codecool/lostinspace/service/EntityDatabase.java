package com.codecool.lostinspace.service;

import com.codecool.lostinspace.entity.Planet;
import com.codecool.lostinspace.entity.Property;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EntityDatabase {
    private List<Property> properties = new ArrayList<>();
    private List<Planet> planets = new ArrayList<>();

    @Autowired
    private PlanetCreator planetCreator;

    @Autowired
    private PropertyCreator propertyCreator;


    public List<String> getPlanets() {
        List<String> planetNames = new ArrayList<>();
        for (Planet planet : planets) {
            planetNames.add(planet.getName());
        }
        return planetNames;
    }

    public double getTotalPropertySizePerPlanet(Planet planet){
        double totalPropertySize = 0;
        for(Property property:properties){
            totalPropertySize += property.getSize();

        }
        return totalPropertySize;
    }
    public void addPlanetList(){
        planets = planetCreator.createPlanetList();
    }

    public  void addProperty(int price, int size, Planet planet){
        Property property = propertyCreator.createProperty(price, size, planet);
        properties.add(property);
    }

}
