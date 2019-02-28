package pl.com.britenet;

import static java.lang.Integer.valueOf;
import static pl.com.britenet.Gender.FEMALE;
import static pl.com.britenet.Gender.MALE;

public class PeselGenderExtractor {

    public Gender getSexFromPESEL(String pesel) {
        return valueOf(pesel.charAt(9)) % 2 == 0 ? MALE : FEMALE; // bug :)
    }
}
