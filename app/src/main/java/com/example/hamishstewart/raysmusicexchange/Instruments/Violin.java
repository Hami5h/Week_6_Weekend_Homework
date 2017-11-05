package com.example.hamishstewart.raysmusicexchange.Instruments;

import com.example.hamishstewart.raysmusicexchange.Behaviours.Playable;

/**
 * Created by hamishstewart on 03/11/2017.
 */

public class Violin extends Instrument implements Playable {
    private String type;
    private int numberOfStrings;

    public Violin(String type, int numberOfStrings, double purchasePrice, double salePrice, String colour) {
        super(purchasePrice, salePrice, colour);
        this.type = type;
        this.numberOfStrings = numberOfStrings;
    }

    public String play() {
        return "I am a Violin!";
    }

    public double calculateMarkUp() {
        return this.salePrice - this.purchasePrice;
    }

    public String GetType() {
        return this.type;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

}
