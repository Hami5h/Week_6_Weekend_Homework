package com.example.hamishstewart.raysmusicexchange;

import com.example.hamishstewart.raysmusicexchange.Behaviours.Sellable;

import java.util.ArrayList;

/**
 * Created by hamishstewart on 03/11/2017.
 */

public class Shop {
    private String name;
    private ArrayList<Sellable> stock;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<Sellable>();
    }

    public String getName() {
        return name;
    }

    public void addToStock(Sellable item) {
        this.stock.add(item);
    }

    public int getStockLevel() {
        return this.stock.size();
    }

    public void removeFromStock(Sellable item) {
        this.stock.remove(item);
    }

    public double calculateProfit() {
        double profit = 0;
        for (Sellable item : stock) {
            profit += item.calculateMarkUp();
        }
        return profit;
    }

}
