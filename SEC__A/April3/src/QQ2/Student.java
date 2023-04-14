package QQ2;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Student {
    public String name;
    public int age;
    public int mark;
   
    public StudentS(String name, int age, int mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
     
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getMark() {
        return mark;
    }

 

    public static void main(String[] args) {
        LinkedList<StudentS> students = new LinkedList<>();

        students.add(new Student("Ajay", 20, 90));
        students.add(new Student("Raj", 21, 85));
        students.add(new Student("Mohan", 19, 92));
        students.add(new Student("Rajvir", 22, 80));

        System.out.println("List of students:");
        for (StudentS student : students) {
            System.out.println(student.getName() + " " + student.getAge() + " " + student.getMark()      );
        }

        Scanner sc = new Scanner(System.in);
       
       
        System.out.println("Enter a student's name to be dispayed:");
        String name1 = sc.next();
       
        ListIterator<String> it=student.listIterator();
        while(it.hasNext()) {
String s = it.next();
System.out.println(s);
}
       
        boolean ans = students.contains(name1);
        if(ans)
                System.out.println("contained");
               else
                System.out.println("not contained");
       
       
       
       
        students.remove();
        for (Student student : students) {
                   System.out.println(student.getName() + " " + student.getAge() + " " + student.getMark()      );
               }
    }
}
