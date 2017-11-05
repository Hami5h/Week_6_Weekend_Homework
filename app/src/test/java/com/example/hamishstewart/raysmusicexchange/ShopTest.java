package com.example.hamishstewart.raysmusicexchange;

import com.example.hamishstewart.raysmusicexchange.Instruments.Guitar;
import com.example.hamishstewart.raysmusicexchange.Instruments.GuitarType;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by hamishstewart on 03/11/2017.
 */

public class ShopTest {
    Shop shop;

    @Before
    public void before() {
        shop = new Shop("Ray's Music Store");
    }

    @Test
    public void hasName() {
        assertEquals("Ray's Music Store", shop.getName());
    }

    @Test
    public void stockStartsEmpty() {
        assertEquals(0, shop.getStockLevel());
    }

    @Test
    public void canAddItemToStock() {
        Guitar guitar = new Guitar(GuitarType.ELECTRIC, 6, 150.00, 200.00, "Dark Oak");
        shop.addToStock(guitar);
        assertEquals(1, shop.getStockLevel());
    }

    @Test
    public void canRemoveItemFromStock() {
        Guitar guitar = new Guitar(GuitarType.ACOUSTIC, 6, 180.00, 240.00, "Light Oak");
        shop.addToStock(guitar);
        assertEquals(1, shop.getStockLevel());
        shop.removeFromStock(guitar);
        assertEquals(0, shop.getStockLevel());
    }
}
