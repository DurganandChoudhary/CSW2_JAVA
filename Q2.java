import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count=0;
		System.out.print(" n = ");
		int n=sc.nextInt();
		for(int i=n;i>=2;) {
			 i=i/2;
			if(i>2)
				count++;
			//System.out.println(i);
			
		}
		System.out.println(count);
	}

}
