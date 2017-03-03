package com.coffee.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "TRANSACTIONS")
public class Transaction {

    @Id
    @Column
    private String id = UUID.randomUUID().toString();
    
    @Column
    @OneToMany()
    private Long userId;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "date_time")
    private LocalDateTime timeStamp;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }
}
