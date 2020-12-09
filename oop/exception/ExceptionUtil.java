package oop.exception;

public class ExceptionUtil {
    public static void validate(LoginRequest request) throws ValidationException {
        if (request.username == null) {
            throw new ValidationException("data tidak boleh null");
        } else if (request.username == "") {
            throw new ValidationException("data tidak boleh kosong");
        } else if (request.password == null) {
            throw new ValidationException("data tidak boleh null");
        } else if (request.password == "") {
            throw new ValidationException("data tidak boleh kosong");
        }
    }
}
