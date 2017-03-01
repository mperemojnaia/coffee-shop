package com.coffee.types;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

public enum BeverageType {
    ESPRESSO("Espresso"),
    AMERICANO("Americano"),
    CAPPUCCINO("Cappuccino"),
    MOCHA("Mocha"),
    LATTE("Latte");

    BeverageType(String value) {
    }

    public List<BeverageType> getTeaTypes(){
        return new ArrayList<BeverageType>(EnumSet.allOf(BeverageType.class));
    }

}
