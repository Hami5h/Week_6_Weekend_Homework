package com.example.hamishstewart.raysmusicexchange;

import com.example.hamishstewart.raysmusicexchange.Instruments.Violin;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by hamishstewart on 03/11/2017.
 */

public class ViolinTest {
        Violin violin;

        @Before
        public void before () {
            violin = new Violin("String Instrument", 4, 350.00, 455.00, "Light pine");
        }

        @Test
        public void canGetType() {
            assertEquals("String Instrument", violin.GetType());
        }

        @Test
        public void canGetNumberOfStrings() {
            assertEquals(4, violin.getNumberOfStrings());
        }

        @Test
        public void canGetPurchasePrice() {
            assertEquals(350.00, violin.getPurchasePrice(), 0.01);
        }

        @Test
        public void canGetSalePrice() {
            assertEquals(455.00, violin.getSalePrice(), 0.01);
        }

        @Test
        public void canCalcluateMarkUp() {
            assertEquals(105.00, violin.calculateMarkUp(), 0.01);
        }

        @Test
        public void canGetColour() {
            assertEquals("Light pine", violin.getInstrumentColour());
        }

    }
