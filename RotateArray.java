public class RotateArray {
   public static void rotate(int arr[],int d,int n)
   {
        int p=1;
        while(p<=d)
            int last=arr[0];
        for(int i=0;i<n-1;i++){
            arr[i]=arr[i+1];
        }
        arr[n-1]=last;
        p++;
    }
    for(int i=0;i<n;i++){
        System.out.println(arr[i]+" ");
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60};
        int N = arr.length;
        int d=2;
        rotate(arr,d,N)
    }


}
