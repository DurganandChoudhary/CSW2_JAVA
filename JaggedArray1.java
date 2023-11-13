package Array;

import java.util.Scanner;

public class JaggedArray1 
{
    public static void main(String[] args) 
    {
        int arr[][];
        System.out.println("Enter row of an array");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        arr = new int[row][];
        for(int i = 0;i<row;i++)
        {
            System.out.println("Enter column size of row "+i);
            int col = sc.nextInt();
            arr[i] = new int[col];
        }
        System.out.println("plz enter elements ");
        for(int i = 0;i<row;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements : ");

        for(int i = 0;i<row;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
        
    }
    
}
