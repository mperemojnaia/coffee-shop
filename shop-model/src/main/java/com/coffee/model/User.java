package com.coffee.model;

import com.coffee.types.BeverageType;
import com.coffee.types.RoleType;

import javax.persistence.*;

@Entity
@Table(name = "USERS")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "FIRST_NAME")
    @Enumerated
    private BeverageType firstName;

    @Column(name = "LAST_NAME")
    @Enumerated
    private BeverageType lastName;

    @Column(name = "ROLE_TYPE")
    @Enumerated
    private RoleType role;
    
    @Column(name = "IS_ACTIVE")
    private Boolean isActive;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public BeverageType getFirstName() {
        return firstName;
    }

    public void setFirstName(BeverageType firstName) {
        this.firstName = firstName;
    }

    public BeverageType getLastName() {
        return lastName;
    }

    public void setLastName(BeverageType lastName) {
        this.lastName = lastName;
    }

    public RoleType getRole() {
        return role;
    }

    public void setRole(RoleType role) {
        this.role = role;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }
}
