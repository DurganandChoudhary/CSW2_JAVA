import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Input number of Strings");
		int n=sc.nextInt();
		String arr[]=new String[n];
		System.out.println("Enter strings");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.next();
		}
			
			for(int i=arr.length-1;i>=0;i--)
			{
				System.out.println(arr[i]);
			}
		}
		
		
	}


