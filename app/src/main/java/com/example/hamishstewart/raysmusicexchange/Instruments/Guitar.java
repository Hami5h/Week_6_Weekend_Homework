package com.example.hamishstewart.raysmusicexchange.Instruments;

import com.example.hamishstewart.raysmusicexchange.Behaviours.Playable;
import com.example.hamishstewart.raysmusicexchange.Behaviours.Sellable;

/**
 * Created by hamishstewart on 03/11/2017.
 */

public class Guitar extends Instrument implements Playable, Sellable {
    private GuitarType type;
    private int numberOfStrings;



    public Guitar(GuitarType type, int numberOfStrings, double purchasePrice, double salePrice, String colour) {
        super(purchasePrice, salePrice, colour);
        this.type = type;
        this.numberOfStrings = numberOfStrings;

    }

    public String play() {
        return "I am a Guitar!";
    }

    public double calculateMarkUp() {
        return this.salePrice - this.purchasePrice;
    }

    public GuitarType getType() {
        return this.type;
    }

    public int getNumberOfStrings() {
        return this.numberOfStrings;
    }


}
