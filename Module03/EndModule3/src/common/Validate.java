package common;

public class Validate {
    private static String regex = "";

    public static boolean checkName(String str) {
        regex = "^[A-Z][a-z]{0,}([\\s][A-Z][a-z]{0,})*$";
        return str.matches(regex);
    }

    public static boolean checkIdCustomer(String str) {
        regex = "^PT[-]\\d{3}$";
        return str.matches(regex);
    }

    public static  boolean checkDate(String str) {
        regex = "^\\d{2}(\\/|-)\\d{2}(\\/|-)\\d{4}$";
        return str.matches(regex);
    }

    public static boolean checkPhoneNumber(String str) {
        regex = "^0[0-9]{9}$";
        return str.matches(regex);
    }

}
