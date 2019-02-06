package com.codecool.lostinspace.controller;

import com.codecool.lostinspace.entity.Planet;
import com.codecool.lostinspace.service.EntityDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class SpaceController {

    @Autowired
    private EntityDatabase entityDatabase;


    @RequestMapping("/")
    public String welcome() {
        return "welcome.html";
    }
    @GetMapping("/list")
    public List<String> planetList() {
        entityDatabase.addPlanetList();
        return entityDatabase.getPlanets();
    }


//    @PostMapping("/accomodation")
//    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
//        model.addAttribute("name", name);
//        return "greeting";
//    }

}
