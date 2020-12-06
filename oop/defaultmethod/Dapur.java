package oop.defaultmethod;

public interface Dapur {
    void cook(String foodName);

    default void buy(String vegetable) {
        System.out.println("membeli " + vegetable + " jika dibutuhkan");
    }
}
