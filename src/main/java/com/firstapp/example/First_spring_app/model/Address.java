package com.firstapp.example.First_spring_app.model;

import org.springframework.stereotype.Component;

@Component
public class Address {
    private int doorNum;
    private String streetName;
    private String city;

    //creating getter and setter]

    public int getDoorNum() {
        return doorNum;
    }

    public void setDoorNum(int doorNum) {
        this.doorNum = doorNum;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
