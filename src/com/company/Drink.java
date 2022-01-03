package com.company;

public class Drink {
    String name;
    boolean gaseous_drink;
    int price, amount;
    public Drink(String name, int price, int amount, boolean gaseous_drink){
        this.name = name;
        this.price = price;
        this.amount = amount;
    }
    public int getPrice(){
        return price;
    }
}

