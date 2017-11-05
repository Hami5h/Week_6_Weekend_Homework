package com.example.hamishstewart.raysmusicexchange;

import com.example.hamishstewart.raysmusicexchange.Miscellaneous.SheetMusic;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by hamishstewart on 03/11/2017.
 */

public class SheetMusicTest {
    SheetMusic sheetMusic;

    @Before
    public void before() {
        sheetMusic = new SheetMusic("Piano Music", 4, 6);
    }

    @Test
    public void canGetType() {
        assertEquals("Piano Music", sheetMusic.getType());
    }

    @Test
    public void canGetPurchasePrice() {
        assertEquals(4.00, sheetMusic.getPurchasePrice(), 0.01);
    }

    @Test
    public void canGetSalePrice() {
        assertEquals(6.00, sheetMusic.getSalePrice(), 0.01);
    }

    @Test
    public void canCalcluateMarkUp() {
        assertEquals(2.00, sheetMusic.calculateMarkUp(), 0.01);
    }

}
