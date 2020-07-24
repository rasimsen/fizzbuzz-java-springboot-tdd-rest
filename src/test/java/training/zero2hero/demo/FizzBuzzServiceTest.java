package training.zero2hero.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import training.zero2hero.demo.service.FizzBuzzService;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FizzBuzzServiceTest {
    @Autowired
    private FizzBuzzService fizzBuzzService;

    @Test
    public void fizzTest(){
        assertEquals("Fizz",fizzBuzzService.calculate(3));
        assertEquals("Fizz",fizzBuzzService.calculate(6));
    }

    @Test
    public void buzzTest(){
        assertEquals("Buzz",fizzBuzzService.calculate(5));
        assertEquals("Buzz",fizzBuzzService.calculate(10));
    }

    @Test
    public void fizzBuzzTest(){
        assertEquals("FizzBuzz",fizzBuzzService.calculate(15));
        assertEquals("FizzBuzz",fizzBuzzService.calculate(30));
    }

    @Test
    public void fizzBuzzExtremeValuesTest(){
        assertEquals("Invalid",fizzBuzzService.calculate(1));
        assertEquals("Invalid",fizzBuzzService.calculate(7));
        assertEquals("Invalid",fizzBuzzService.calculate(11));
    }
}