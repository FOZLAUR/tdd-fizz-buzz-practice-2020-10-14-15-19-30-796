package tdd.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    final private static String FIZZ = "Fizz";
    final private static String BUZZ = "Buzz";
    final private static String WHIZZ = "Whizz";
    final private static int MOD3 = 3;
    final private static int MOD5 = 5;
    final private static int MOD7 = 7;

    public String countOff(int input){
        List<String> output = new ArrayList<String>();
        if(input % MOD3 == 0){
            output.add(FIZZ);
        }
        if(input % MOD5 == 0){
            output.add(BUZZ);
        }
        if(input % MOD7 == 0){
            output.add(WHIZZ);
        }
        return output.size() == 0 ? String.valueOf(input) : output.stream().reduce("", String::concat);
    }
}
