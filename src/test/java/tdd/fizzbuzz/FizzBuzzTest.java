package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    public void should_order_number_when_count_off_given_normal_number() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int input = 1;
        String actual = fizzBuzz.countOff(input);
        assertEquals("1", actual);
    }

    @Test
    public void should_fizz_when_count_off_given_multiple_of_three() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int input = 3;
        String actual = fizzBuzz.countOff(input);
        assertEquals("Fizz", actual);
    }

    @Test
    public void should_buzz_when_count_off_given_multiple_of_five() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int input = 5;
        String actual = fizzBuzz.countOff(input);
        assertEquals("Buzz", actual);
    }

    @Test
    public void should_whizz_when_count_off_given_multiple_of_seven() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int input = 7;
        String actual = fizzBuzz.countOff(input);
        assertEquals("Whizz", actual);
    }

    @Test
    public void should_fizz_buzz_when_count_off_given_multiple_of_three_and_five() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int input = 15;
        String actual = fizzBuzz.countOff(input);
        assertEquals("FizzBuzz", actual);
    }

    @Test
    public void should_fizz_whizz_when_count_off_given_multiple_of_three_and_seven() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int input = 21;
        String actual = fizzBuzz.countOff(input);
        assertEquals("FizzWhizz", actual);
    }

    @Test
    public void should_buzz_whizz_when_count_off_given_multiple_of_five_and_seven() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int input = 35;
        String actual = fizzBuzz.countOff(input);
        assertEquals("BuzzWhizz", actual);
    }

    @Test
    public void should_fizz_buzz_whizz_when_count_off_given_multiple_of_three_and_five_and_seven() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int input = 105;
        String actual = fizzBuzz.countOff(input);
        assertEquals("FizzBuzzWhizz", actual);
    }
}
