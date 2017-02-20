package com.coffee.types;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

public enum TeaType {
    GREEN("Green tea"),
    BLACK("Black tea"),
    CHAMOMILE("Chamomile tea"),
    MELISSA("Melissa tea"),
    GINGER("Ginger tea"),
    EARL_GREY("Earl grey tea");

    TeaType(String value) {
        
    }

    public List<TeaType> getTeaTypes(){
       return new ArrayList<TeaType>(EnumSet.allOf(TeaType.class));
    }
}
