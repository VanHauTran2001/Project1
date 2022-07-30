package com.healthy.fruitHealthy;

import java.io.Serializable;

public class Fruit implements Serializable {
    private String name;
    private String decription;
    private int price;
    private int unit;
    private int image;

    public Fruit(String name, String decription, int price, int unit, int image) {
        this.name = name;
        this.decription = decription;
        this.price = price;
        this.unit = unit;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
