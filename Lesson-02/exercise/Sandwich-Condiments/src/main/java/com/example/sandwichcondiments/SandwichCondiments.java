package com.example.sandwichcondiments;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;

@Controller
public class SandwichCondiments {
    @RequestMapping(value = {"","/"})
    public String home() {
        return "home";
    }
    @RequestMapping("/save")
    public String getCondiments(Model model, @RequestParam("condiment") String[] condiment ) {
        model.addAttribute("condiments", Arrays.toString(condiment));
     return "sandwich";
    }
}
