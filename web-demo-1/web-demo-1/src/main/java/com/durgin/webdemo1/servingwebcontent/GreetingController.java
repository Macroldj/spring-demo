package com.durgin.webdemo1.servingwebcontent;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
    @GetMapping("/apple")
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "lidejin") String name, Model model){
        model.addAttribute( "name", name);
        return "greeting";
    }
}
