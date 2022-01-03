package com.company;

public class Client {
    String fullName;
    int cardNum, balance;
    Client(String fullName, int cardNum, int balance){
        this.fullName = fullName;
        this.cardNum = cardNum;
        this.balance = balance;
    }
    public boolean isEmpty(){
        if (balance==0){
            return true;
        }
        return false;
    }
    public void add(int sum){
        balance+=sum;
    }
    public void getBalance(){
        System.out.println(balance);
    }
}
