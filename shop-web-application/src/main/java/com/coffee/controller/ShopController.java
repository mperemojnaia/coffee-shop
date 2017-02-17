package com.coffee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/shop")
public class ShopController {
    
    @RequestMapping(method = RequestMethod.GET)
    public String shopping(ModelMap model) {

        model.addAttribute("message", "Spring 3 MVC - Hello World");
        return "shop";

    }


}
