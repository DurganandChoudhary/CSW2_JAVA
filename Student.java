
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Student {
    private String name;
    private int age;
    private int mark;

    public Student(String name, int age, int mark) {
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
        LinkedList<Student> students = new LinkedList<>();

        students.add(new Student("Ajay", 20, 90));
        students.add(new Student("Raj", 21, 85));
        students.add(new Student("Mohan", 19, 92));
        students.add(new Student("Rajvir", 22, 80));

        System.out.println("List of students:");
        for (Student student : students) {
            System.out.println(student.getName() + " " + student.getAge() + " " + student.getMark()      );
        }

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter a student's name to be dispayed:");
        String name1 = sc.next();

        ListIterator<Student> it=students.listIterator();
        while(it.hasNext()) {
            Student s = it.next();
            String name = s.name;
            System.out.println(s);
            if(name.equals(name1))
                System.out.println("true");
            else
                System.out.println("false");
        }

        students.remove(1);
        for (Student student : students) {
            System.out.println(student.getName() + " " + student.getAge() + " " + student.getMark()      );
        }
        System.out.println(students.size());
    }
}














