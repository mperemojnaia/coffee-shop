package com.coffee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import static com.coffee.types.BeverageType.getBeverageTypes;

@Controller
@RequestMapping("/shop")
public class ShopController {
    
    @RequestMapping(method = RequestMethod.POST)
    public String shopping(ModelMap model) {

        model.addAttribute("beverageTypes", getBeverageTypes());
        return "shop";

    }
    
}
