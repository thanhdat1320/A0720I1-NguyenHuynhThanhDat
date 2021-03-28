package common;

public class Validation {
    private static String regex = "";

    public static boolean checkEmail(String str) {
        regex = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
        return str.matches(regex);
    }
}
