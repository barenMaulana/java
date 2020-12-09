package oop.exception;

public class ValidationException extends Throwable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    ValidationException(String message) {
        super(message);
    }
}
