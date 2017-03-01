package com.coffee.model;

import com.coffee.types.BeverageType;
import com.coffee.types.Flavouring;
import com.coffee.types.SizeType;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "COFFEE")
public class Beverage {

    @Id
    private Long id;

    private SizeType size;

    private BeverageType beverageType;

    private Flavouring flavour;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SizeType getSize() {
        return size;
    }

    public void setSize(SizeType size) {
        this.size = size;
    }

    public BeverageType getBeverageType() {
        return beverageType;
    }

    public void setBeverageType(BeverageType beverageType) {
        this.beverageType = beverageType;
    }

    public Flavouring getFlavour() {
        return flavour;
    }

    public void setFlavour(Flavouring flavour) {
        this.flavour = flavour;
    }

}
