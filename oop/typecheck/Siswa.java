package oop.typecheck;

public class Siswa extends Greet {

    String nama;

    Siswa(String nama) {
        super(nama);
        System.out.println("Selamat datang siswa " + nama);
    }
}
