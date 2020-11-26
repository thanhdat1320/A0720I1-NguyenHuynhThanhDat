package end_module02.Exception;

public class UserException extends Exception {
    private String message;

    public UserException(String message) {
        super(message);
    }
}
