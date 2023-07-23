package com.example.calculator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Calculator {
    @RequestMapping({"/",""})
    public String calculator() {
        return "calculator";
    }
@RequestMapping("/calculator")
    public String processCalculate(Model model, @RequestParam float number1, float number2, String operator) {
    float result = 0;
    switch (operator) {
        case "+":
            result = number1 + number2;
            break;
        case "-":
            result = number1 - number2;
            break;
        case "*":
            result = number1 * number2;
            break;
        case "/":
            result = number1 / number2;
            break;
    }
    model.addAttribute("result", result);
    return "calculator";
}
}
