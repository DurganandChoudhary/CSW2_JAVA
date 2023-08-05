import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
 
public class PairsHavingGivenSum {
    // Function to print the pair of elements having a given sum
    static void printPairs(int[] array,int sum)
    {
        HashMap<Integer,Integer> obj=new HashMap<>();
        int i,search;
        System.out.println("The pairs having sum "+sum+" are");
        for(i=0;i<array.length;i++){
            search=sum-array[i];
            if(obj.containsValue(search)){
                System.out.println(array[i]+" and "+search);
            }
            else
            {
                obj.put(i,array[i]);
            }
        }
    }
    // Main function to read the input
    public static void main(String[] args) {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int size;
        System.out.println("Enter the size of the array");
        try{
            size=Integer.parseInt(br.readLine());
        }
        catch(Exception e)
        {
            System.out.println("Invalid Input");
            return;
        }
        int[] array=new int[size];
        System.out.println("Enter array elements");
        int i;
        for(i=0;i<array.length;i++){
            try{
                array[i]=Integer.parseInt(br.readLine());
            }
            catch(Exception e)
            {
                System.out.println("Invalid element. Enter it again");
                i--;
            }
        }
        int sum;
        System.out.println("Enter the sum you want to look for");
        try{
            sum=Integer.parseInt(br.readLine());
        }
        catch(Exception e)
        {
            System.out.println("Invalid Input");
            return;
        }
        printPairs(array,sum);
    }
}