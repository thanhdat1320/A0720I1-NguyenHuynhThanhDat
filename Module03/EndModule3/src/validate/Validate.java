package validate;

public class Validate {
    private static String regex = "";

    public static boolean checkBirthday(String str) {
        regex = "^(0[1-9]|1[012])[-/.](0[1-9]|[12][0-9]|3[01])[-/.](19|20)\\d\\d$";
        return str.matches(regex);
    }
}
