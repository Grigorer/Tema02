package ro.siit;
// Calculate the sum of the first 100 numbers higher than 0

public class CalculateSum {

    public static int Suma(int n) {

        // n = 100;
        int sum=0;

        for (int i = 1; i <= n; i++){
            sum = sum + i;
            // System.out.println(sum);
        }
        return sum;
    }
}
