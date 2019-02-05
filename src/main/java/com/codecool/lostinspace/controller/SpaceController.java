package com.codecool.lostinspace.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class SpaceController {


    @RequestMapping("/")
    public String welcome() {
        return "welcome.html";
    }


//    @PostMapping("/accomodation")
//    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
//        model.addAttribute("name", name);
//        return "greeting";
//    }

}
