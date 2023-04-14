package karan;
import java.util.*;
import java.util.LinkedList;

public class p28 {

	public static void main(String[] args) {
		LinkedList<Student> obj = new LinkedList<Student>();
		 Student s1=new Student();
		 s1.name="karan";
		 s1.age=20;
		 s1.marks=100;
		 obj.add(s1);
		 int size = obj.size();
		 s1.display();
		 System.out.println("Size of linked list = " + size);
		 System.out.println("Linked list is: " + obj);
		 obj.remove(s1);
		 size = obj.size();
		 System.out.println("Size of linked list = " + size);
	}

}
class Student+
{
	String name;
	int age;
	int marks;
	void display()
	{
		System.out.println("Student details");
		System.out.println(name);
		System.out.println(age);
		System.out.println(marks);
	}
	
	
}
