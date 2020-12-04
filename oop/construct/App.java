package oop.construct;

public class App {
    public static void main(String[] args) {
        Dapur risol = new Dapur("risol", 10);
        System.out.println(risol.foodName);
        System.out.println(risol.foodAmount);
    }
}