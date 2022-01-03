package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Drink cola = new Drink("Coca Cola", 8000, 5, true);
        Drink denay =  new Drink("Denay", 5500, 7000, false);
        Drink pepsi = new Drink("Pepsi", 7500, 8000, true);
        Drink appleJuice = new Drink("Apple Juice", 5000, 6500, false);
        Drink peachJuice = new Drink("Peach Juice", 5000, 6500, false);
        VendingMachine m1 = new VendingMachine(100, 100000);
        Client cl1 = new Client("Maftuna Vohidjonovna", 12545, 500000);
        System.out.println(cola.getPrice());
        System.out.println(m1.isFull());
        System.out.println(m1.isEmpty());
        System.out.println(m1.addDrink(cola, "27.12.2021"));
        System.out.println(m1.addDrink(pepsi, "28.12.2021"));
        System.out.println(m1.sell(cl1, cola));
        System.out.print("machine balance: ");
        m1.getBalance();
        m1.date = new String[]{"27.12.2021", "cola sotildi" };
        System.out.print("client kartasi bo'shmi? ");
        System.out.println(cl1.isEmpty());
        cl1.add(12000);
        System.out.print("client balansi: ");
        cl1.getBalance();
        System.out.println(m1.dayBalance(m1.date));
        System.out.println(Arrays.toString(m1.info_machine[0]));
        System.out.println(Arrays.toString(m1.info_machine[1]));
        System.out.print("qaysi sanadagi ma'lumotni ko'rmoqchisiz? ");
        String searching_info = in.nextLine();
        m1.info_machine_date(searching_info);
    }
}