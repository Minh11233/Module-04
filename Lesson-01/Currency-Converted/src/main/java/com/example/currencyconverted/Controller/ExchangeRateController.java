package com.example.currencyconverted.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ExchangeRateController {
    @RequestMapping("/convert")
    public String convert(@RequestParam("exchangeRate") float exchangeRate,@RequestParam("USD") float USD, Model model) {
        float result = exchangeRate * USD;
        model.addAttribute("result", result);
        return "index";
    }
    @RequestMapping("/")
    public String home() {
        return "index";
    }
}
