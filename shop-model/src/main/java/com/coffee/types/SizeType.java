package com.coffee.types;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

public enum SizeType {
    SMALL("Small cup"),
    MID("Midi cup"),
    BIG("Big cup");

    SizeType(String value) {
    }

    public List<SizeType> getTeaTypes(){
        return new ArrayList<SizeType>(EnumSet.allOf(SizeType.class));
    }

}
