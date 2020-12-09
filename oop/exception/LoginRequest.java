package oop.exception;

public class LoginRequest {
    String username;
    String password;

    LoginRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "LoginRequest [password=" + password + ", username=" + username + "]";
    }

}
