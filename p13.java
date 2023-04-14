package karan;

public class p13 {

	public static void main(String[] args) {
		System.out.println(sum(5));
	}
	static int sum(int n)
	{
		if(n<=0)
		{
			return 0;
		}
		else
		{
			return(n+sum(n-1));
		}
	}

}
