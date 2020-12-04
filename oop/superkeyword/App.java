package oop.superkeyword;

public class App extends Dapur {
    public String chef() {
        System.out.println(super.chef());
        return "didi";
    }

    public static void main(String[] args) {
        Dapur chefName = new App();
        System.out.println(chefName.chef());
    }
}
