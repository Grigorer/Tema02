package ro.siit;
// Display all the prime numbers lower than a given number

public class PrimeNumbers {
    public static boolean isPrime(int n)
    {
// Corner case
        if (n <= 1)
            return false;

// Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }

    // Function to print primes
    public static int printPrime(int n)
    {
        for (int i = 2; i <= n; i++)
        {
            if (isPrime(i))
                System.out.print(i + " ");
        }

        return (n);
    }
}
