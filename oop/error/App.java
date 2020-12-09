package oop.error;

public class App {
    public static void main(String[] args) {
        DatabaseConnection conn = new DatabaseConnection("", "maulana");
        ErrorUtil.credential(conn);
        System.out.println("connected");
    }
}
