package com.example.hamishstewart.raysmusicexchange.Miscellaneous;

import com.example.hamishstewart.raysmusicexchange.Behaviours.Sellable;

/**
 * Created by hamishstewart on 03/11/2017.
 */

public class ViolinString implements Sellable {
    private String type;
    private double purchasePrice;
    private double salePrice;

    public ViolinString(String type, double purchasePrice, double salePrice ) {
        this.type = type;
        this.purchasePrice = purchasePrice;
        this.salePrice = salePrice;
    }

    public double calculateMarkUp() {
        return this.salePrice - this.purchasePrice;
    }
}
