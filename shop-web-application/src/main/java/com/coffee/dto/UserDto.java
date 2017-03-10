package com.coffee.dto;

import com.coffee.validation.annotation.PasswordMatches;
import com.coffee.validation.annotation.ValidEmail;
import com.sun.istack.internal.NotNull;

@PasswordMatches
public class UserDto {

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    @NotNull
    private String password;
    
    @NotNull
    private String matchingPassword;

    @NotNull
    @ValidEmail
    private String email;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMatchingPassword() {
        return matchingPassword;
    }

    public void setMatchingPassword(String matchingPassword) {
        this.matchingPassword = matchingPassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
