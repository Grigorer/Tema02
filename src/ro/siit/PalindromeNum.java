package ro.siit;

public class PalindromeNum {

    public static int CheckPalindrome(int inputNumber)
    {

        int remainder, reverse=0, polindrome;
        // int inputNumber = 121;    //Number to be checked for palindrome

        polindrome = inputNumber;

        // Reverse the input number

        while(polindrome > 0)
        {
            System.out.println("Input Number is: " + polindrome);
            remainder = polindrome%10;    //getting remainder
            System.out.println("The remainder is: " + remainder);
            System.out.println("Digit "+remainder+ " was added to reverse number "+(reverse*10));
            reverse =(reverse*10)+remainder;
            // System.out.println(remainder);
            polindrome=polindrome/10;
            // System.out.println("New input number is :" + polindrome);

        }

        // if the inputNumber is  equal to the reversed one, than the number is palindrome otherwise is not palindrome

        if( reverse == inputNumber )
            System.out.println("Number " + inputNumber + " is palindrome ");
        else
            System.out.println("Number " + inputNumber + " is not palindrome");

        return reverse;
    }
}
