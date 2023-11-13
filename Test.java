package Array;

import java.util.*;

class Test
{
    public static void main(String[] args) {
        
        int [][]arr;
        System.out.println("Enter row and col of array");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        arr = new int[row][col];
        System.out.println("plz enter "+row*col+" no of elements");

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Elements are : ");

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}