package karan;

public class p1 {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int find =4;
		int count=0;
		int ll=0;
		int ul=a.length-1;
		while(ll<=ul)
		{
		  int mid=(ul+ll)/2;
		  if(a[mid]==find)
		  {
			  System.out.println("element found at index "+mid );
			  count=1;
			  break;
		  }
		  else if(a[mid]<find)
		  {
			  ll=mid+1;
		  }
		  else
		  {
			ul=mid-1;  
		  }
		}
		if(count==0)
			System.out.println("element not found");
		

	}

}
