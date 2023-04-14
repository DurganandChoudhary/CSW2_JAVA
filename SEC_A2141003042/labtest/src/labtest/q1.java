package labtest;
public class q1
{
	public static void main(String args[])
	{
		int a[]= {2,3,5,8,9,12};
		int key=12;
		int count=0;
		int l=0;
		int u=a.length-1;
		while(l<=u)
		{
			  int mid=(u+l)/2;
			  if(a[mid]==key)
			  {
				  System.out.println("Element found at index: "+mid );
				  count=1;
				  break;
			  }
			  else if(a[mid]<key)
			  {
				  l=mid+1;
			  }
			  else
			  {
				u=mid-1;  
			  }
			}
			if(count==0)
				System.out.println("Element not found!");
			

		}


		
	}

