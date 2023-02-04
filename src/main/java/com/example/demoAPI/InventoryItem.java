package com.example.demoAPI;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.UpperCamelCaseStrategy.class)
public class InventoryItem {
    private int Id;
    private String Name;
    private String Type;
    private String Connector;
    private int LengthInFeet;

    public int getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public String getType() {
        return Type;
    }

    public String getConnector() {
        return Connector;
    }

    public int getLengthInFeet() {
        return LengthInFeet;
    }

    public String getColor() {
        return Color;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setType(String type) {
        Type = type;
    }

    public void setConnector(String connector) {
        Connector = connector;
    }

    public void setLengthInFeet(int lengthInFeet) {
        LengthInFeet = lengthInFeet;
    }

    public void setColor(String color) {
        Color = color;
    }

    private String Color; //should be an enum in a final product
}
