package oop.tostringmethod;

public class Chef implements Dapur {
    String makanan;

    Chef(String foodName) {
        makanan = foodName;
    }

    public void cook() {
        System.out.println("chef sedang memasak sesuatu");
    }

    public String toString() {
        return "chef sedang memasak " + makanan;
    }
}
