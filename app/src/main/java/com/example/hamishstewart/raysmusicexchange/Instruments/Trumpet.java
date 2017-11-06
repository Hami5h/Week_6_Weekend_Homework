package com.example.hamishstewart.raysmusicexchange.Instruments;

import com.example.hamishstewart.raysmusicexchange.Behaviours.Playable;
import com.example.hamishstewart.raysmusicexchange.Behaviours.Sellable;

/**
 * Created by hamishstewart on 03/11/2017.
 */

public class Trumpet extends Instrument implements Playable, Sellable{
    private String type;
    private int numberOfValves;


    public Trumpet(String type, int numberOfValves, double purchasePrice, double salePrice, String colour) {
        super(purchasePrice, salePrice, colour);
        this.type = type;
        this.numberOfValves = numberOfValves;

    }

    public String play() {
        return "I am a Trumpet!";
    }

    public double calculateMarkUp() {
        return this.salePrice - this.purchasePrice;
    }

    public String GetType() {
        return this.type;
    }

    public int getNumberOfValves() {
        return this.numberOfValves;
    }


}
