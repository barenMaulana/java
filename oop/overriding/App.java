package oop.overriding;

public class App extends Dapur {

    void chef() {
        System.out.println("who cooked today is baren chef");
    }

    public static void main(String[] args) {
        Dapur masak = new App();
        masak.chef();
    }

}
