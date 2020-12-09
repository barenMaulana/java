package oop.runtimeexception;

public class App {
    public static void main(String[] args) {
        LoginRequest login = new LoginRequest(null, "maulana");
        ExceptionUtil.validate(login);
    }
}
