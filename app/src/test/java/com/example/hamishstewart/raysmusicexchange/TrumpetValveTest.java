package com.example.hamishstewart.raysmusicexchange;

import com.example.hamishstewart.raysmusicexchange.Miscellaneous.TrumpetValve;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by hamishstewart on 03/11/2017.
 */

public class TrumpetValveTest {
    TrumpetValve trumpetValve;

    @Before
    public void before () {
        trumpetValve  = new TrumpetValve("Spare", 23.00, 46.00);
    }

    @Test
    public void canGetType() {
        assertEquals("Spare", trumpetValve.getType());
    }

    @Test
    public void canGetPurchasePrice() {
        assertEquals(23.00, trumpetValve.getPurchasePrice(), 0.01);
    }

    @Test
    public void canGetSalePrice() {
        assertEquals(46.00, trumpetValve.getSalePrice(), 0.01);
    }

    @Test
    public void canCalcluateMarkUp() {
        assertEquals(23.00, trumpetValve.calculateMarkUp(), 0.01);
    }

}
