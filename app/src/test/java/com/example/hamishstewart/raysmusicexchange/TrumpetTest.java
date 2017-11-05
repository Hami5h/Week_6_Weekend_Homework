package com.example.hamishstewart.raysmusicexchange;

import com.example.hamishstewart.raysmusicexchange.Instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by hamishstewart on 03/11/2017.
 */

public class TrumpetTest {
    Trumpet trumpet;

    @Before
    public void before () {
        trumpet = new Trumpet("Horrible Instrument", 3, 50.00, 85.00, "Yellowish");
    }

    @Test
    public void canGetType() {
        assertEquals("Horrible Instrument", trumpet.GetType());
    }

    @Test
    public void canGetNumberOfValves() {
        assertEquals(3, trumpet.getNumberOfValves());
    }

    @Test
    public void canGetPurchasePrice() {
        assertEquals(50.00, trumpet.getPurchasePrice(), 0.01);
    }

    @Test
    public void canGetSalePrice() {
        assertEquals(85.00, trumpet.getSalePrice(), 0.01);
    }

    @Test
    public void canCalcluateMarkUp() {
        assertEquals(35.00, trumpet.calculateMarkUp(), 0.01);
    }

    @Test
    public void cangetColour() {
        assertEquals("Yellowish", trumpet.getInstrumentColour());
    }
}
