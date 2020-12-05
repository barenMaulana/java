package oop.polymorphism;

public class Guru extends Greet {
    String nama;

    Guru(String nama) {
        super(nama);
        System.out.println("Selamat datang pak guru " + nama);
    }
}
