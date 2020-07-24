package training.zero2hero.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import training.zero2hero.demo.service.FizzBuzzService;
import training.zero2hero.demo.service.FizzBuzzServiceInterface;

@RestController
@RequestMapping("/api/v1.0")
public class FizzBuzzController {
    @GetMapping("/fizzbuzz/check/{value}")
    public String check(@PathVariable int value){
        FizzBuzzServiceInterface fizzBuzzService = new FizzBuzzService();
        return fizzBuzzService.calculate(value);
    }
}
