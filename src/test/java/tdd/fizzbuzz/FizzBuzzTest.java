package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    public void should_order_number_when_count_off_given_normal_number() throws Exception{
        FizzBuzz fizzBuzz = new FizzBuzz();
        int input = 1;
        String actual = fizzBuzz.countOff(input);
        assertEquals("1", actual);
    }
}
