package oop.anonymousclass;

public class App {
    public static void main(String[] args) {
        Dapur chef = new Dapur() {
            public void hireChef() {
                System.out.println("mencari seorang chef...");
            }
        };

        chef.hireChef();
    }
}
