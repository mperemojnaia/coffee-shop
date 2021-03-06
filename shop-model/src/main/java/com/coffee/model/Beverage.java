package com.coffee.model;

import com.coffee.types.BeverageType;
import com.coffee.types.Flavouring;
import com.coffee.types.SizeType;

import javax.persistence.*;

@Entity
@Table(name = "BEVERAGE")
public class Beverage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @Enumerated
    private SizeType size;

    @Column(name = "beverage_type")
    @Enumerated
    private BeverageType beverageType;

    @Column(name = "flavour")
    @Enumerated
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
