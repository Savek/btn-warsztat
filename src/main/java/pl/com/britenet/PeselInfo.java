package pl.com.britenet;

import java.time.LocalDate;

public class PeselInfo {

    private String pesel;
    private LocalDate birthDate;
    private Gender gender;

    public PeselInfo(String pesel, LocalDate birthDate, Gender gender) {
        this.pesel = pesel;
        this.birthDate = birthDate;
        this.gender = gender;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
