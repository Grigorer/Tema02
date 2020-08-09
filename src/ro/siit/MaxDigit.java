package ro.siit;
// Display the max digit from a number.

public class MaxDigit {

    public static int MaximumDigit(int number)
    {
        int largest = 0;
        System.out.println("Input number is " + number );

        while(number != 0)
        {
            int rest = number % 10;

            // Find the largest digit
            largest = Math.max(rest, largest);

            number = number / 10;
        }

        System.out.println("Max digit is: " ); return largest;
    }
}
