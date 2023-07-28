import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("a = ");
		int a=sc.nextInt();
		
		System.out.println("b = ");
		int b=sc.nextInt();
		
		System.out.println("c = ");
		int c=sc.nextInt();
		
		if((a + b == c) || (a == b - c) || (a * b ==c )) {
			System.out.println("TRUE");
		}
		else {
			System.out.println("FALSE");
		}
	}

}
