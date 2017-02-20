package com.coffee.types;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

public enum CoffeeType {
    ESPRESSO("Espresso"),
    AMERICANO("Americano"),
    CAPPUCCINO("Cappuccino"),
    MOCHA("Mocha"),
    LATTE("Latte");

    CoffeeType(String value) {
    }

    public List<CoffeeType> getTeaTypes(){
        return new ArrayList<CoffeeType>(EnumSet.allOf(CoffeeType.class));
    }

}
