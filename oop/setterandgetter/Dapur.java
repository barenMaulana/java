package oop.setterandgetter;

public class Dapur {
    private String bestMenu = "risol";

    public void setMenu(String newMenu) {
        // make validation
        if (newMenu == null) {
            System.out.println("you can not give null to menu");
        }
        bestMenu = newMenu;
    }

    public String getMenu() {
        return bestMenu;
    }
}
