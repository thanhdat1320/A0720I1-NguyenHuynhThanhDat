package furama_resort.Exception;

public class EmailException extends UserException{
    public EmailException(String message) {
        super(message);
    }

    public static boolean checkEmail(String email) {
        String regex = "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
        boolean check = email.matches(regex);
        try {
            if (!check) {
                throw new EmailException("Invalid Email, Please Input Again");
            }
        } catch (EmailException ex) {
            System.out.println(ex.getMessage());
        }
        return check;
    }
}
