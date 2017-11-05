package com.example.hamishstewart.raysmusicexchange.Instruments;

/**
 * Created by hamishstewart on 03/11/2017.
 */

public abstract class Instrument {
    double purchasePrice;
    double salePrice;
    String colour;


    public Instrument(double purchasePrice, double salePrice, String colour) {
        this.purchasePrice = purchasePrice;
        this.salePrice = salePrice;
        this.colour = colour;
    }

    public String getInstrumentColour() {
        return this.colour;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public double getSalePrice() {
        return salePrice;
    }
}
