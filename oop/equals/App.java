package oop.equals;

public class App {
    public static void main(String[] args) {
        Chef makanan = new Chef();
        System.out.println(makanan.makanan1.equals(makanan.makanan2));
        System.out.println(makanan.makanan1 == makanan.makanan2);
    }
}
