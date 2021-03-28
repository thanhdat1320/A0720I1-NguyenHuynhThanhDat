package com.example.basket.models;

import lombok.Data;

@Data
public class Basket {
    private int amount;

    public Basket(int amount) {
        this.amount = amount;
    }

    public Basket() {
    }
}
