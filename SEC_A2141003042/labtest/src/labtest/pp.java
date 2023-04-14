package labtest;

public class pp {
	int binarySearch(int arr[], int l, int r, int x){
		if (r>=1) {
			int mid = 1+(r-1)/2;
			if (arr[mid]==x)
            return mid;
			if(arr[mid]>x)
				return binarySearch(arr, 1, mid-1,x);
			return binarySearch(arr, mid+1,r,x);
		}
		return -1;
	}
	public static void main(String[] args) {
	q1 ob = new q1();
	int arr[] = {54, 58, 56 ,45};
	int n= arr.length;
	int x= 56;
	
	
	}
}
		
	
