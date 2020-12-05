package oop.polymorphism;

public class Staf extends Greet {
    String nama;

    Staf(String nama) {
        super(nama);
        System.out.println("Selamat datang bu staf " + nama);
    }
}
