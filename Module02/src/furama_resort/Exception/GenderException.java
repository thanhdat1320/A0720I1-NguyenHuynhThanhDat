package furama_resort.Exception;

public class GenderException extends UserException {
    public GenderException(String message) {
        super(message);
    }

    public static boolean checkGender(String gender) {
        String regex = "(Male)|(Female)|(Unknown)";
        boolean check = gender.matches(regex);
        try {
          if (!check) {
              throw new GenderException("Invalid Email, Please Input Again (Male, Female, Unknown)");
          }
        } catch (GenderException ex) {
            System.out.println(ex.getMessage());
        }
        return check;
    }
}
