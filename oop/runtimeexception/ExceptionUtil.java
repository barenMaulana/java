package oop.runtimeexception;

public class ExceptionUtil {
    public static void validate(LoginRequest request) {
        if (request.username == null) {
            throw new ValidationRuntimeException("data tidak boleh null");
        } else if (request.username == "") {
            throw new ValidationRuntimeException("data tidak boleh kosong");
        } else if (request.password == null) {
            throw new ValidationRuntimeException("data tidak boleh null");
        } else if (request.password == "") {
            throw new ValidationRuntimeException("data tidak boleh kosong");
        }
    }
}
