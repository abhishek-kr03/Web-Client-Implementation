package com.webclient.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
    private Integer id;
    private String email;
    
    @JsonProperty("first_name")
    private String firstName;
    
    @JsonProperty("last_name")
    private String lastName;
    
    private String avatar;

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

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

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
    @Override
    public String toString() {
        return "User{id=" + id + 
               ", email='" + email + '\'' +
               ", first_name='" + firstName + '\'' +
               ", last_name='" + lastName + '\'' +
               ", avatar='" + avatar + '\'' + '}';
    }
}