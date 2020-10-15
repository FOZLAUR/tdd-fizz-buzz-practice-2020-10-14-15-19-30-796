package tdd.fizzbuzz;

public class FizzBuzz {
    final private static String FIZZ = "Fizz";

    public String countOff(int input){
        if(input % 3 == 0){
            return FIZZ;
        }
        return String.valueOf(input);
    }
}
