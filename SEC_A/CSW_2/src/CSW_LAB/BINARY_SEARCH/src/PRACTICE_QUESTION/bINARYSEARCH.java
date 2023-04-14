package PRACTICE_QUESTION;

public class bINARYSEARCH {
	public int bINARYSEARCH1(int[] arr, int F, int L, int x)
	{
		 int mid=(F+L)/2;
		 if(x==mid)
			 return mid;
		 else if(x>mid+1)
			 return bINARYSEARCH1(arr,mid+1,L,x);
		 else if(x<mid)
			 return bINARYSEARCH1(arr,F,mid-1,x);
		 else
			 return -1;
		 			 
	}

	
	
	public static void main(String[] args) {
		bINARYSEARCH P=new bINARYSEARCH();
		int arr[]= {2,3,5,8,4};
		int n=arr.length;
		int x=10;
		int result=P.bINARYSEARCH1(arr,0,n-1,x);
		if (result==-1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index"+P);
		
		
	}
	

}

