package com.example.hamishstewart.raysmusicexchange;

import com.example.hamishstewart.raysmusicexchange.Miscellaneous.GuitarString;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by hamishstewart on 03/11/2017.
 */

public class GuitarStringTest {
    GuitarString guitarString;

    @Before
    public void before() {
        guitarString = new GuitarString("Spare", 0.50, 0.85);
    }

    @Test
    public void canGetType() {
        assertEquals("Spare", guitarString.getType());
    }

    @Test
    public void canGetPurchasePrice() {
        assertEquals(0.50, guitarString.getPurchasePrice(), 0.01);
    }

    @Test
    public void canGetSalePrice() {
        assertEquals(0.85, guitarString.getSalePrice(), 0.01);
    }

    @Test
    public void canCalcluateMarkUp() {
        assertEquals(0.35, guitarString.calculateMarkUp(), 0.01);
    }



}
