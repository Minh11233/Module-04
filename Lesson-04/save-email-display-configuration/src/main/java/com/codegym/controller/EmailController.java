package com.codegym.controller;

import com.codegym.model.Email;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmailController {
    @RequestMapping("")
    public ModelAndView home() {
        Email email = new Email();
        email.setLanguage("English");
        email.setPageSize("5");
        email.setSpamFilter("Enable");
        email.setSignature("Minh");
        ModelAndView modelAndView = new ModelAndView("/home");
        modelAndView.addObject("email",email);
        return modelAndView;
    }

    @RequestMapping("/edit")
    public ModelAndView edit(@ModelAttribute("email") Email email) {
        ModelAndView modelAndView = new ModelAndView("/edit");
        modelAndView.addObject("email",email);
        return modelAndView;
    }

    @RequestMapping("/update")
    public ModelAndView update(@ModelAttribute("email") Email email) {
        email.setLanguage(email.language);
        email.setSpamFilter(email.spamFilter);
        email.setPageSize(email.pageSize);
        email.setSignature(email.signature);
        ModelAndView modelAndView = new ModelAndView("/home");
        modelAndView.addObject("email",email);
        return modelAndView;
    }
}
