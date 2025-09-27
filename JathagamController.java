package com.jathagam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class JathagamController {

    @GetMapping("/")
    public String home() {
        return "form";
    }

    @PostMapping("/generate")
    public String generate(
            @RequestParam String name,
            @RequestParam String dob,
            @RequestParam String tob,
            @RequestParam String place,
            Model model) {

        model.addAttribute("name", name);
        model.addAttribute("dob", dob);
        model.addAttribute("tob", tob);
        model.addAttribute("place", place);

        return "result";
    }
}
