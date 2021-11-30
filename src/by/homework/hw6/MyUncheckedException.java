package by.homework.hw6;

public class MyUncheckedException extends RuntimeException {

    public MyUncheckedException() {
    }

    public MyUncheckedException(String message) {
        super(message);
    }

    public MyUncheckedException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyUncheckedException(Throwable cause) {
        super(cause);
    }

    @Override
    public String getMessage() {
        return "This is Unchecked Exception. Don't worry!";
    }
}
