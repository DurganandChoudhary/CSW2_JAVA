package CSW_LAB;
//WAP that takes an array and a value to search for, perform linear search, if the element is found return the index, if not found return -1.

public class LinearSearch {
	
		
		static int search(int arr[], int n, int x)
		{
			for (int i = 0; i < n; i++) {
				
				if (arr[i] == x)
					return i;
			}

			return -1;
		}

		public static void main(String[] args)
		{
			int[] arr = { 11, 702,451, 47, 105,222,341,555,12,88 };
			int n = arr.length;
			
			int x = 555;

			int index = search(arr, n, x);
			if (index == -1)
				System.out.println("Element is not present in the array");
			else
				System.out.println("Element found at position " + index);
		}
	

}