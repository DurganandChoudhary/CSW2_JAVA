import java.util.Scanner;
public class tower1 {
    public static void main(String[] args, char C, char B, char A, int n) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of disks: ");
        int number=sc.nextInt();
        tower(n,'A','B','C');
    }
    public static void tower(int n,char A,char B,char C)
    {
        if(n>0)
        {
            tower(n-1,A,C,B);
            System.out.println("Move Disk "+A+"---->"+B);
            tower(n-1,C,B,A);
        }
    }

}
