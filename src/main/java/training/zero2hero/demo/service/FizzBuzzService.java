package training.zero2hero.demo.service;

import org.springframework.stereotype.Service;

@Service
public class FizzBuzzService implements FizzBuzzServiceInterface {

    @Override
    public String calculate(int value) {

        if (value % 15 == 0) {
            return FIZZ_BUZZ;
        } else if (value % 5 == 0) {
            return BUZZ;
        } else if (value % 3 == 0) {
            return FIZZ;
        }

        return INVALID;
    }
}
