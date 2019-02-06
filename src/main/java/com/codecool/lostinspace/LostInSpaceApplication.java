package com.codecool.lostinspace;

import com.codecool.lostinspace.service.PlanetCreator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class LostInSpaceApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(LostInSpaceApplication.class);

    @Autowired
    private PlanetCreator planetCreator;


    public static void main(String[] args) {
        SpringApplication.run(LostInSpaceApplication.class, args);
    }
    @PostConstruct
    public void afterInit(){
//        planetCreator.putPlanetsToPlanetMap();
        LOGGER.info(planetCreator.createPlanetList().toString());
    }
}

