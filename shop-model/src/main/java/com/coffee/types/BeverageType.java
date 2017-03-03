package com.coffee.types;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

public enum BeverageType {
    ESPRESSO("Espresso"),
    AMERICANO("Americano"),
    CAPPUCCINO("Cappuccino"),
    MOCHA("Mocha"),
    LATTE("Latte"),
    GREEN("Green tea"),
    BLACK("Black tea"),
    CHAMOMILE("Chamomile tea"),
    MELISSA("Melissa tea"),
    GINGER("Ginger tea"),
    EARL_GREY("Earl grey tea");

    BeverageType(String value) {
    }

    public static List<BeverageType> getBeverageTypes(){
        return new ArrayList<BeverageType>(EnumSet.allOf(BeverageType.class));
    }

}
