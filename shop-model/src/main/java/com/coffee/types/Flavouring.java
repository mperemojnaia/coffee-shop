package com.coffee.types;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

public enum Flavouring {
    COCOA,
    SYRUP,
    CREAM,
    CINNAMON,
    LEMON;

    public List<Flavouring> getTeaTypes(){
        return new ArrayList<Flavouring>(EnumSet.allOf(Flavouring.class));
    }

    }
