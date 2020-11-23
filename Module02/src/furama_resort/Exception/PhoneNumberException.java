package furama_resort.Exception;

public class PhoneNumberException extends UserException {
    public PhoneNumberException(String message) {
        super(message);
    }

    public static boolean checkPhoneNumber(String number) {
        String regex = "^(090|091|\\(84\\)\\+90|\\(84\\)\\+91)[\\d]{7}$";
//        String regex = "^$";
        boolean check = number.matches(regex);
        try {
            if (!check) {
                throw new PhoneNumberException("Invalid Phone Number, Please Input Again");
            }
        } catch (PhoneNumberException ex) {
            System.out.println(ex.getMessage());
        }
        return check;
    }
}
