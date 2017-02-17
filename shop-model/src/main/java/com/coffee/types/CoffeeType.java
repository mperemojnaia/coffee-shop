package com.coffee.types;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

public enum CoffeeType {
    ESPRESSO,
    AMERICANO,
    CAPPUCCINO,
    MOCHA,
    LATTE;

    public List<CoffeeType> getTeaTypes(){
        return new ArrayList<CoffeeType>(EnumSet.allOf(CoffeeType.class));
    }

}
