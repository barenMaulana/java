package oop.statickeyword;

public class Dapur {
    public static final String FOODNAME = "mie";
    public static int orders;

    public static void hireChef() {
        System.out.println("mencari chef baru...");
    }

    static {
        System.out.println("set orders");
        orders = 5;
        System.out.println("the orders " + orders);
    }
}
