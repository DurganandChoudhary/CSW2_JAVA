package ZerosOnes;

import java.util.Arrays;

public class Q1 
{
    private static void sortBinaryArray(int[] inputArray)
    {
        int zeroCount = 0;
         
        System.out.println("Input Array Before Sorting : "+Arrays.toString(inputArray));
         
        //Counting the zeroes..
         
        for (int i = 0; i < inputArray.length; i++) 
        {
            if (inputArray[i] == 0)
            {
                zeroCount++;
            }
        }
         
        //Rewriting the array with 0s...
         
        for (int i = 0; i < zeroCount; i++) 
        {
            inputArray[i] = 0;
        }
         
        //... and remaining places with 1s
         
        for (int i = zeroCount; i < inputArray.length; i++) 
        {
            inputArray[i] = 1;
        }
         
        System.out.println("Input Array After Sorting : "+Arrays.toString(inputArray));
    }
     
    public static void main(String[] args) 
    {
        sortBinaryArray(new int[] {1, 0, 1, 1, 0, 1, 0, 0});
         
        System.out.println("========================");
         
        sortBinaryArray(new int[] {1, 1, 1, 1, 0, 0, 0, 0});
         
        System.out.println("========================");
         
        sortBinaryArray(new int[] {1, 1, 0, 0, 1, 1, 0, 0});
    }
}