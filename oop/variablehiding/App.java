package oop.variablehiding;

public class App {
    public static void main(String[] args) {
        Chef chef = new Chef();
        chef.foodName = "risol";
        System.out.println(chef.foodName);
        chef.cook("ayam");

        System.out.println("");
        System.out.println("-");
        System.out.println("");

        Dapur dapurBaru = new Dapur();
        dapurBaru.foodName = "Gulai";
        System.out.println(dapurBaru.foodName);
        dapurBaru.cook("sate");

        System.out.println("");
        System.out.println("-");
        System.out.println("");

        Dapur dapur = (Dapur) chef;
        dapur.foodName = "es buah";
        System.out.println(dapur.foodName);
        dapur.cook("mie");
    }
}
