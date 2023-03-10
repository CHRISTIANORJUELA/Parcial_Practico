package com.example.almacen.models;

import java.time.LocalDate;

public class ReceiptJewel {
    private String nameJewel;
    private  float priceJewel;

    private LocalDate localDate;

    public ReceiptJewel(String nameJewel, float priceJewel, LocalDate localDate) {
        this.nameJewel = nameJewel;
        this.priceJewel = priceJewel;
        this.localDate = localDate;
    }

    public String getNameJewel() {
        return nameJewel;
    }

    public void setNameJewel(String nameJewel) {
        this.nameJewel = nameJewel;
    }

    public float getPriceJewel() {
        return priceJewel;
    }

    public void setPriceJewel(float priceJewel) {
        this.priceJewel = priceJewel;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }
}
