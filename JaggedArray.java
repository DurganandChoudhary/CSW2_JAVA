package Array;

public class JaggedArray 
{
    public static void main(String[] args) 
    {
        int arr[][] = new int[3][];
        arr[0] = new int[2];
        arr[1] = new int[3];
        arr[2] = new int[1];
        arr[1][2] = 44;
        System.out.println(arr[1][2]);
        
    }
    
}
