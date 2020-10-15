package tdd.fizzbuzz;

public class FizzBuzz {
    public String countOff(int input){
        if(input % 3 == 0){
            return "Fizz";
        }
        return String.valueOf(input);
    }
}
