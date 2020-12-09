package oop.numclass;

public class App {
    public static void main(String[] args) {
        Chef chef = new Chef();
        chef.setChefName("azriel");
        System.out.println("chef kita " + chef.getChefName());

        chef.setMenu(Menu.RISOL);
        System.out.println("menu kali ini adalah " + chef.getMenu());

        var menus = Menu.valueOf("RISOL");
        System.out.println(menus);

        System.out.println("====================== semua value menu ======================");
        Menu[] allMenu = Menu.values();
        for (var menu : allMenu) {
            System.out.println(menu);
        }
    }
}
