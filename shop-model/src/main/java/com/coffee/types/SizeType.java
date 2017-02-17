package com.coffee.types;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

public enum SizeType {
    SMALL,
    MID,
    BIG;

    public List<SizeType> getTeaTypes(){
        return new ArrayList<SizeType>(EnumSet.allOf(SizeType.class));
    }

}
