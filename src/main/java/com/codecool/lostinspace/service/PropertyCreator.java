package com.codecool.lostinspace.service;

import com.codecool.lostinspace.entity.Planet;
import com.codecool.lostinspace.entity.Property;
import org.springframework.stereotype.Component;

@Component
public class PropertyCreator {

    public Property createProperty(int price, int size, Planet planet){
        Property property = new Property(price, size,planet);
        return property;
    }
}
