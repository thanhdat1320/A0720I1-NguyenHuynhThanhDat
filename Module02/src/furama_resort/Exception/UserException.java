package furama_resort.Exception;

public class UserException extends Exception{
    private String message;

    public UserException(String message) {
        super(message);
    }
}
