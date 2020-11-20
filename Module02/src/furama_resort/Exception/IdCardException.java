package furama_resort.Exception;

public class IdCardException extends UserException {
    public IdCardException(String message) {
        super(message);
    }

    public static boolean checkID(String id) {
        String regex = "^(\\d{3})\\s(\\d{3})\\s(\\d{3})$";
        boolean check = id.matches(regex);
        try {
            if (!check) {
                throw new IdCardException("Invalid IdCard, Please Input Again (XXX XXX XXX)");
            }
        } catch (IdCardException ex) {
            System.out.println(ex.getMessage());
        }
        return check;
    }
}
