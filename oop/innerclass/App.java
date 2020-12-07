package oop.innerclass;

public class App {
    public static void main(String[] args) {
        Dapur chef = new Dapur();
        chef.setChefName("baren maulana");
        System.out.println("chef " + chef.getChefName());

        Dapur.Chef resep = chef.new Chef();
        resep.setResep("risol");
        System.out.println("resep rahasia dari bahan makanan : " + resep.getResep());
    }
}
