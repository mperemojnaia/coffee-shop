package com.coffee.types;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

public enum Flavouring {
    COCOA("Cocoa"),
    SYRUP("Syrup"),
    CREAM("Cream"),
    CINNAMON("Cinnamon"),
    LEMON("Lemon");

    Flavouring(String value) {
    }

    public List<Flavouring> getTeaTypes(){
        return new ArrayList<Flavouring>(EnumSet.allOf(Flavouring.class));
    }

    }
