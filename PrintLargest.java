package Array;
//To Find largest three elements
public class PrintLargest {
    static void print3largest(int arr[],int size)
    {
        int i,first,second,third;

        //there should be atleast 3 elements

        if(size<3)
        {
            System.out.println("invalid input....");
            return;
        }
        third=first=second=Integer.MIN_VALUE;
        for(i=0;i<size;i++)
        {
            //if current element is greater than first

            if(arr[i]>first)
            {
                third=second;
                second = first;
                first=arr[i];
            }

            /*if arr[i] is in between first and second then update second */
            else if(arr[i]>second)
            {
                third=second;
                second=arr[i];
            }
            else if(arr[i]>third)
            
                third=arr[i];
            
            
            
        }
        System.out.println("Three largest elements are "+first+" "+second+" "+third);
    }
    public static void main(String[] args) {

        int arr[]={12,13,1,10,34,1};
        int n=arr.length;
        print3largest(arr, n);
        
    }
    
}
