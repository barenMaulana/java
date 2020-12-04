package oop.superconstructtor;

public class App extends Dapur {
    String aplication;

    public App(String aplication) {
        super("risol");
        this.aplication = aplication;
    }

    public static void main(String[] args) {
        App aplikasi = new App("kitchen");
        System.out.println(aplikasi.aplication);
    }
}
