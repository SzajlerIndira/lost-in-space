package com.codecool.lostinspace.controller;

import com.codecool.lostinspace.entity.Planet;
import com.codecool.lostinspace.service.EntityDatabase;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
//@RestController
public class SpaceController {


    @RequestMapping("/")
    public String welcome(Model model) {
        model.addAttribute("planets", EntityDatabase.getInstance().getPlanetNames());
        return "welcome";
    }

    @GetMapping("/list")
    public List<String> planetList() {
        return EntityDatabase.getInstance().getPlanetNames();
    }

    @RequestMapping("/planet")
    public String planet(Model model, HttpServletRequest httpServletRequest) {
        String planetName = httpServletRequest.getParameter("planet");
        Planet planet = EntityDatabase.getInstance().getPlanet(planetName);
        model.addAttribute("planetName", planetName);
        model.addAttribute("availableTerritory", planet.getAvailableLandspace());
        return "planet";
    }

    @PostMapping("/<planet_name>")
    public String getSize(@RequestParam(name = "size", required = false) String name, Model model) {
        model.addAttribute("name", name);
        return "<planet name>";
    }

}
