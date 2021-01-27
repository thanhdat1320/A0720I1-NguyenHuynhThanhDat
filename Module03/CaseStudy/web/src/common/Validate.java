package common;

public class Validate {
    private static String regex = "";

    public static boolean checkIdCustomer(String str) {
        regex = "^KH[-]\\d{4}$";
        return str.matches(regex);
    }

    public static boolean checkPhoneNumber(String str) {
        regex = "^0[0-9]{9}$";
        return str.matches(regex);
    }

    public static boolean checkEmail(String str) {
        regex = "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
        return str.matches(regex);
    }

}
