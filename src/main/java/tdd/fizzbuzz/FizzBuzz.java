package tdd.fizzbuzz;

public class FizzBuzz {
    final private static String FIZZ = "Fizz";
    final private static String BUZZ = "Buzz";
    final private static String WHIZZ = "Whizz";
    final private static int MOD3 = 3;
    final private static int MOD5 = 5;
    final private static int MOD7 = 7;

    public String countOff(int input){
        if(input % MOD3 == 0){
            return FIZZ;
        }
        if(input % MOD5 == 0){
            return BUZZ;
        }
        if(input % MOD7 == 0){
            return WHIZZ;
        }
        return String.valueOf(input);
    }
}
