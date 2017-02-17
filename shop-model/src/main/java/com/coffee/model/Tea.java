package com.coffee.model;

import com.coffee.types.Flavouring;
import com.coffee.types.SizeType;
import com.coffee.types.TeaType;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "TEA_PURCHASE")
public class Tea {

    @Id
    private Long id;
    
    private SizeType size;
    
    private TeaType teaType;
    
    private Flavouring flavour;
    
    @DBRef
    private Transaction transaction;
    
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

    public TeaType getTeaType() {
        return teaType;
    }

    public void setTeaType(TeaType teaType) {
        this.teaType = teaType;
    }

    public Flavouring getFlavour() {
        return flavour;
    }

    public void setFlavour(Flavouring flavour) {
        this.flavour = flavour;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }
}
