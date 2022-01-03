package com.company;

import java.util.Arrays;

public class VendingMachine {
    int capacity, balance;
    int n;
    String[] date;
    String[] drinks = new String[n];
    String[][] info_machine = new String[50][3];
    int counter = 0;
    int new_balance = 0;
    public VendingMachine(int capacity, int balance){
        this.capacity = capacity;
        this.balance = balance;
    }
    public boolean isFull(){
        if (capacity==0){
            return true;
        }
        return false;
    }
    public boolean isEmpty(){
        return true;
    }
    public boolean addDrink(Drink beverage, String date){
        new_balance+=beverage.price * beverage.amount;
        info_machine[counter] = new String[]{beverage.name, date, String.valueOf(new_balance)};
        counter++;
        if (beverage.amount < capacity){
            beverage.amount--;
            capacity-=beverage.amount;
            balance+=beverage.price;
            return true;
        }
        new_balance = 0;
        return false;
    }
    public boolean sell(Client cl1, Drink beverage){
        if (cl1.balance >= beverage.price && beverage.amount > 0){
            capacity-=beverage.amount;
            cl1.balance-=beverage.price;
            return true;
        }
        return false;
    }
    public String dayBalance(String[] date){
        String date_value = date[0];
        String info_value = date[1];
        return date_value +" kuni " + info_value;
    }
    public void getBalance(){
        System.out.println(balance);
    }
    public void info_machine_date(String date){
        for (String[] i : info_machine){
            System.out.println(Arrays.toString(i));
        }
    }
}
