package oop.extendsinterface;

public class Chef implements Dapur {
    public void cook(String foodName) {
        System.out.println("memasak makanan " + foodName);
    }

    public void buy(String vegetable) {
        System.out.println("sedang membeli " + vegetable);
    }
}