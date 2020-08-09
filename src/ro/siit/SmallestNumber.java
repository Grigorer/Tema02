package ro.siit;

public class SmallestNumber {

    public static int MinArray(int[] arr){

        //Initialize the array

        arr = new int[]  {22, 11, 7, 33, 56, 8, 1};
        int min = arr[0];
        //Loop through the array

        for (int i = 0; i < arr.length; i++) {
            //Compare elements of array with min
            if(arr[i] <min)
                min = arr[i];
        }
        System.out.println("Smallest element present in given array is: " + min );

        return min;

    }

   }
