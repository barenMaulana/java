package oop.error;

public class ErrorUtil {
    public static void credential(DatabaseConnection request) {
        if (request.username == null) {
            System.out.println("username " + request.username + " tidak cocok");
            throw new Config("connection failed");
        } else if (request.username.isBlank()) {
            System.out.println("username tidak boleh kosong");
            throw new Config("connection failed");
        } else if (request.password == null) {
            System.out.println("password " + request.username + " tidak cocok");
            throw new Config("connection failed");
        } else if (request.password.isBlank()) {
            System.out.println("password tidak boleh kosong");
            throw new Config("connection failed");
        }
    }
}
