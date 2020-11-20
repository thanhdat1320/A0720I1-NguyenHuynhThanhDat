package furama_resort.Exception;

public class NameException extends UserException {
    public NameException(String message) {
        super(message);
    }

    public static boolean checkName(String name) {
        String regex = "^[A-Z][a-z]{0,}([\\s][A-Z][a-z]{0,})*$";
        boolean check = name.matches(regex);
        try {
            if (!check) {
                throw new NameException("Invalid Name, Please Input Again (Nguyen Van A)");
            }
        } catch (NameException ex) {
            System.out.println(ex.getMessage());
        }
        return check;
    }
}
