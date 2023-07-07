package April21_2023;
public class q4 {
	static int minSwaps(int arr[], int size, int val)
	{
	 int swapCount = 0;
	 int first = 0;
	 int second = size - 1; 
	 int temp;
	 while (first < second)
	 {
	 if (arr[first] <= val)
	 first += 1;
	 else if (arr[second] > val)
	 second -= 1;
	 else
	 {
	 temp = arr[first];
	 arr[first] = arr[second];
	 arr[second] = temp;
	 swapCount += 1;
	 }
	 }
	 return swapCount;
	}
	public static void main(String[] args) {
	    int[] arr = {9, 2, 6, 5, 1};
	    int size = arr.length;
	    int val = 5;
	    int swapCount = minSwaps(arr, size, val);
	    System.out.println("Minimum number of swaps required: " + swapCount);
	}  
}
