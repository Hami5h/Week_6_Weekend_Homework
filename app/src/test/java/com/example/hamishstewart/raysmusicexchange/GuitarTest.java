package com.example.hamishstewart.raysmusicexchange;

import com.example.hamishstewart.raysmusicexchange.Instruments.Guitar;
import com.example.hamishstewart.raysmusicexchange.Instruments.GuitarType;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by hamishstewart on 03/11/2017.
 */

public class GuitarTest {
    Guitar guitar;

    @Before
    public void before () {
        guitar = new Guitar(GuitarType.BASS, 6, 150.00, 200.00, "Dark Oak");
    }

    @Test
    public void canGetType() {
        assertEquals(GuitarType.BASS, guitar.getType());
    }

    @Test
    public void canGetNumberOfStrings() {
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void canGetPurchasePrice() {
        assertEquals(150.00, guitar.getPurchasePrice(), 0.01);
    }

    @Test
    public void canGetSalePrice() {
        assertEquals(200.00, guitar.getSalePrice(), 0.01);
    }

    @Test
    public void canCalcluateMarkUp() {
        assertEquals(50.00, guitar.calculateMarkUp(), 0.01);
    }

    @Test
    public void canGetColour() {
        assertEquals("Dark Oak", guitar.getInstrumentColour());
    }

}
