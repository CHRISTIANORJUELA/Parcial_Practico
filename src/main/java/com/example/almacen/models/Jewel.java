package com.example.almacen.models;

public class Jewel {
    private String nameUser;
    private String quilates;
    private String typeJewel;

    private float ounces;

    public Jewel(String nameUser, String quilates, String typeJewel, float ounces) {
        this.nameUser = nameUser;
        this.quilates = quilates;
        this.typeJewel = typeJewel;
        this.ounces = ounces;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getQuilates() {
        return quilates;
    }

    public void setQuilates(String quilates) {
        this.quilates = quilates;
    }

    public String getTypeJewel() {
        return typeJewel;
    }

    public void setTypeJewel(String typeJewel) {
        this.typeJewel = typeJewel;
    }

    public float getOunces() {
        return ounces;
    }

    public void setOunces(float ounces) {
        this.ounces = ounces;
    }
}
