package ro.siit;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
	// write your code here
        System.out.println("Check if a number is palindrom( e.g palindrom 1221, 34143)");
        System.out.println(PalindromeNum.CheckPalindrome(343));

        System.out.println("Calculate the sum of the first 100 numbers higher than 0");
        System.out.println(CalculateSum.Suma(100));

        System.out.println("Display the max digit from a number");
        System.out.println(MaxDigit.MaximumDigit(569));

        System.out.println("Display the smallest number from an array of number");
        System.out.println(SmallestNumber.MinArray(new int[7]));

        System.out.println("Display all the prime numbers lower than a given number");
        System.out.println(PrimeNumbers.printPrime(11));
    }
}
