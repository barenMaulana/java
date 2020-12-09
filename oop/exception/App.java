package oop.exception;

public class App {
    public static void main(String[] args) throws ValidationException {
        LoginRequest login = new LoginRequest("baren", "maulana");

        try {
            ExceptionUtil.validate(login);
            System.out.println("validasi berhasil");
            System.out.println("Selamat datang " + login.username);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
