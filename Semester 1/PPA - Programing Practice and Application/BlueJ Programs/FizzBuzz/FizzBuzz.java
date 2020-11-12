
/**
 * FizzBuzz
 *
 * @author Aaron Patrick Monte
 * @version 1.0.0.0
 */
public class FizzBuzz
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class FizzBuzz
     */
    public FizzBuzz()
    {
        // initialise instance variables
        x = 0;
    }
    
    /**
     * Print sum of all numbers between 2 given numbers
     */
    public void sum(int num1, int num2)
    {
        // put your code here
        int sum = 0;
        if( num1 < num2) {
            while (num1 < num2) {
                sum += num1;
                num1++;
                
            }
        }
        else {
            while(num2 < num1) {
                sum += num2;
                num2++;
            }
        }
    }
    
    /**
     * isPrime returns true if a parameter is a prime number, and false if it is not.
     */
    public boolean isPrime(int num)
    {
        boolean primeFlag = true;
        int i = 2; // Start at 2 as a prime number can be divided by 1 and itself
        while (i < num) {
            if (num % i == 0) {
                primeFlag = false;
                return primeFlag;
        }
        
            i++;
    }
    return primeFlag;
    }

    /**
     * Print FizzBuzz
     * Multiples of 3 are printed with "Fizz"
     * Multiples of 5 are printed with "Buzz"
     * Else, it just prints the number
     */
    public void printFizzBuzz()
    {
        int i = 0;
        while (i != 101){
            String fizzBuzzOutput = "";
            if (i % 3 == 0) {
                fizzBuzzOutput += "Fizz";
                if (i % 5 == 0) {
                    fizzBuzzOutput += "Buzz";
                }
            }
            else if (i % 5 == 0) {
                fizzBuzzOutput += "Buzz";
            }
            else {
                fizzBuzzOutput += i;
            }
            System.out.println(fizzBuzzOutput);
            i++;
        }
    }
}
