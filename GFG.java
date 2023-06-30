// Java program for decimal to binary
// conversion using recursion
import java.util.Scanner;

class GFG
{

    // Decimal to binary conversion
    // using recursion
    static int find(int decimal_number)
    {
        if (decimal_number == 0)
            return 0;

        else

            return (decimal_number % 2 + 10 *
                    find(decimal_number / 2));
    }

    // Driver Code
    public static void main(String args[])
    {
        int decimal_number = 10;
        System.out.println(find(decimal_number));
    }

}


