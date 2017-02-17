package com.coffee.model;

import com.coffee.types.CoffeeType;
import com.coffee.types.Flavouring;
import com.coffee.types.SizeType;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "COFFEE")
public class Coffee {

    @Id
    private Long id;

    private SizeType size;

    private CoffeeType coffeeType;

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

    public CoffeeType getCoffeeType() {
        return coffeeType;
    }

    public void setCoffeeType(CoffeeType coffeeType) {
        this.coffeeType = coffeeType;
    }

    public Flavouring getFlavour() {
        return flavour;
    }

    public void setFlavour(Flavouring flavour) {
        this.flavour = flavour;
    }

}
