package com.codecool.lostinspace.controller;

import com.codecool.lostinspace.entity.Planet;
import com.codecool.lostinspace.service.EntityDatabase;
import com.codecool.lostinspace.service.PlanetCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
//@RestController
public class SpaceController {

    @Autowired
    private EntityDatabase entityDatabase;


    @RequestMapping("/")
    public String welcome(Model model) {
        EntityDatabase entityDatabase = new EntityDatabase();
        model.addAttribute("planets",PlanetCreator.planetMap);
        return "welcome";
    }

    @GetMapping("/list")
    public List<String> planetList() {
        entityDatabase.addPlanetList();
        return entityDatabase.getPlanets();
    }

    @RequestMapping("/planet")
    public String getForm(Model model){
        return "planet";
    }

    @PostMapping("/<planet_name>")
    public String getSize(@RequestParam(name="size", required=false) String name, Model model) {
        model.addAttribute("name", name);
        return "<planet name>";
    }

}
