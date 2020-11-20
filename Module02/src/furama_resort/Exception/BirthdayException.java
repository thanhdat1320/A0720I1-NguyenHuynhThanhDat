package furama_resort.Exception;

import java.time.LocalDate;
import java.time.Period;

public class BirthdayException extends UserException {
    public BirthdayException(String message) {
        super(message);
    }

    public static boolean checkBirthday(String birthdayCheck) {
        String regex = "^(0[1-9]|1[012])[-/.](0[1-9]|[12][0-9]|3[01])[-/.](19|20)\\d\\d$";
        boolean check = birthdayCheck.matches(regex);
        try {
            if (check) {
                int day = Integer.parseInt(birthdayCheck.substring(0, 2));
                int month = Integer.parseInt(birthdayCheck.substring(3, 5));
                int year = Integer.parseInt(birthdayCheck.substring(6, 10));
                LocalDate today = LocalDate.now();
                LocalDate birthday = null;
                try {
                    birthday = LocalDate.of(day, month, year);
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }

                if (year <= 1900) {
                    throw new BirthdayException("Fail Must be greater than 1900");
                }
                if (Period.between(birthday, today).getYears() < 18) {
                    throw new BirthdayException("You are not old enough");
                }
            }
        } catch (BirthdayException ex) {
            System.out.println(ex.getMessage());
            check = false;
        }
        return check;
    }
}
