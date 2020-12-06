package oop.defaultmethod;

public class Chef implements Dapur {
    public void cook(String foodName) {
        System.out.println("Memasak " + foodName);
    }

    public void buy(String vegetable) {
        Dapur.super.buy(vegetable);
    }
}
