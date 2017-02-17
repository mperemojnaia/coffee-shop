package com.coffee.types;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

public enum TeaType {
    GREEN,
    BLACK,
    CHAMOMILE,
    MELISSA,
    GINGER,
    EARL_GREY;
    
    public List<TeaType> getTeaTypes(){
       return new ArrayList<TeaType>(EnumSet.allOf(TeaType.class));
    }
}
