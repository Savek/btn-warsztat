package pl.com.britenet;

import java.util.Optional;

public class PeselService {

    private PeselControlSumValidator peselControlSumValidator;

    public PeselService() {
        this.peselControlSumValidator = new PeselControlSumValidator();
    }

    public Optional<PeselInfo> process(String pesel) {

        PeselGenderExtractor peselGenderExtractor = new PeselGenderExtractor();
        // sprawdzenie sumy kontrolnej peselu
        //      jezeli mamy niepoprawna sume kontrolna zwracamy pustego Optionala

        // wyciagniecie daty i płci

        return Optional.empty();
    }
}