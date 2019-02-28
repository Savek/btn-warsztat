package pl.com.britenet;

import java.time.LocalDate;
import java.util.Optional;

import static java.lang.Integer.valueOf;
import static java.lang.String.valueOf;

public class PeselBirthDateUtils {

    static Optional<LocalDate> getBirhtDate(String pesel) {

        String yearOfBirth = getYearOfBirthDateFromPESEL(pesel);
        String monthOfBirth = getMonthOfBirthFromPESEL(pesel);
        String dayOfBirth = getDayOfBirthFromPESEL(pesel);

        try {
            return Optional.of(LocalDate.of(
                    valueOf(yearOfBirth), valueOf(monthOfBirth), valueOf(dayOfBirth)));
        } catch (Exception e) {
            return Optional.empty();
        }
    }

    private static String getYearOfBirthDateFromPESEL(String pesel) {
        String yearOfBirthFromPesel = pesel.charAt(0) + valueOf(pesel.charAt(1));
        String monthOfBirthFromPesel = pesel.charAt(2) + valueOf(pesel.charAt(3));

        if (monthOfBirthFromPesel.startsWith("2") || monthOfBirthFromPesel.startsWith("3")) {
            return "20" + yearOfBirthFromPesel;
        }
        if (monthOfBirthFromPesel.startsWith("0") || monthOfBirthFromPesel.startsWith("1")) {
            return "19" + yearOfBirthFromPesel;
        }
        if (monthOfBirthFromPesel.startsWith("8") || monthOfBirthFromPesel.startsWith("9")) {
            return "18" + yearOfBirthFromPesel;
        }

        return "";
    }

    private static String getMonthOfBirthFromPESEL(String pesel) {

        String monthOfBirthFromPesel = pesel.charAt(2) + valueOf(pesel.charAt(3));

        StringBuilder monthOfBirthFromPESELToBuilder = new StringBuilder(monthOfBirthFromPesel);

        if (monthOfBirthFromPesel.startsWith("0") || monthOfBirthFromPesel.startsWith("1")) {
            return monthOfBirthFromPesel;
        }

        if (monthOfBirthFromPesel.startsWith("2") || monthOfBirthFromPesel.startsWith("3")) {

            monthOfBirthFromPESELToBuilder.setCharAt(0, '0');
            return monthOfBirthFromPESELToBuilder.toString();
        }

        if (monthOfBirthFromPesel.startsWith("8") || monthOfBirthFromPesel.startsWith("9")) {
            monthOfBirthFromPESELToBuilder.setCharAt(0, '0');
            return monthOfBirthFromPESELToBuilder.toString();
        }

        return "";
    }

    private static String getDayOfBirthFromPESEL(String pesel) {
        return valueOf(pesel.charAt(4)) + pesel.charAt(5);
    }

}
