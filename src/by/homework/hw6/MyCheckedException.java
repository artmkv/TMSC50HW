package by.homework.hw6;

import java.io.IOException;

public class MyCheckedException extends IOException {

    public MyCheckedException() {
    }

    public MyCheckedException(String message) {
        super(message);
    }

    public MyCheckedException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyCheckedException(Throwable cause) {
        super(cause);
    }

    @Override
    public String getMessage() {
        return "This is Checked Exception. Please don't write such bad code.";
    }
}
