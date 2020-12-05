package oop.setterandgetter;

public class App {
    public static void main(String[] args) {
        Dapur menu = new Dapur();
        var greatMenu = menu.getMenu();
        System.out.println(greatMenu);

        System.out.println("");
        System.out.println("");

        menu.setMenu("dragon fruit");
        System.out.println(menu.getMenu());
    }
}
