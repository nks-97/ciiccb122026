package chapter1;

import java.util.Random;

public class Main{
    public static void main(String[] args) {

        Toy toy1 = new Toy();
        toy1.name ="Rage pink";
        toy1.brand = "Lab Vuvu";
        toy1.price = 4500;
        toy1.quantity = 12;
        System.out.println();
        
        Random r = new Random();
        System.out.println(r.nextInt(100));

    }
}
