import java.util.Scanner;
class Student
{
	int roll;
	String name,course;
	void inputStudent()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Input roll,name and course");
		roll=sc.nextInt();
		name=sc.next();
		course=sc.next();
	}
	void displayStudent()
	{
		System.out.println(roll+" "+name+" "+course);
	}
}
class Exam extends Student
{
	int marks1,marks2,marks3;
	void inputmarks()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Input 3 marks");
		marks1=sc.nextInt();
		marks2=sc.nextInt();
		marks3=sc.nextInt();
	}
	void displayResult()
	{
		System.out.println("Result="+(marks1+marks2+marks3));
	}
}
public class TestStudent {

	public static void main(String[] args) {
		
		Exam a[]=new Exam[2];
		for(int i=0;i<a.length;i++)
		{
			a[i]=new Exam();
		}
		System.out.println("Input Student Details");
		for(int i=0;i<a.length;i++)
		{
			a[i].inputStudent();
			a[i].inputmarks();
		}
		for(int i=0;i<a.length;i++)
		{
			a[i].displayStudent();
			a[i].displayResult();
		}

	}

}
