package labtest;

import java.util.*;

public class q2 {
    private static ArrayList<Employee> employeeList = new ArrayList<>();

    public static void main(String[] args) {
        // Add 10 employees to the database
        addEmployee(new Employee(2141019044, "Anushka"));
        addEmployee(new Employee(2141016336, "Arpita"));
        addEmployee(new Employee(2141019027, "Lakshay"));
        addEmployee(new Employee(2141013029, "Jordan"));
        addEmployee(new Employee(2141018027, "Naveen"));
        addEmployee(new Employee(2141018080, "Tyalor"));
        addEmployee(new Employee(2141017033, "Aryan"));
        addEmployee(new Employee(2141012003, "Dustin"));
        addEmployee(new Employee(2141013900, "Sachin"));
        addEmployee(new Employee(2141015566, "Laxmi"));

       
        System.out.println("Employee Database:");
        sortEmployeeListById();//ascending order
        for (Employee employee : employeeList) {
            System.out.println("ID: " + employee.getId() + ", Name: " + employee.getName());
        }

        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee id to search: ");
        int id = sc.nextInt();
        if (searchEmployee(id)) {
            System.out.println("Employee found in the database!");
        } else {
            System.out.println("Employee not found in the database!");
        }

      
        System.out.print("Enter employee id to remove: ");
        id = sc.nextInt();
        if (removeEmployee(id)) {
            System.out.println("Employee removed from the database!");
        } else {
            System.out.println("Employee not found in the database!");
        }

        
        System.out.println("Size of the employee database: " + getDatabaseSize());
    }

    public static void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public static boolean searchEmployee(int id) {
        for (Employee employee : employeeList) {
            if (employee.getId() == id) {
                return true;
            }
        }
        return false;
    }

    public static boolean removeEmployee(int id) {
        for (Employee employee : employeeList) {
            if (employee.getId() == id) {
                employeeList.remove(employee);
                return true;
            }
        }
        return false;
    }

    public static int getDatabaseSize() {
        return employeeList.size();
    }

    // Sort employeeList by id in ascending order (without using Comparator)
    public static void sortEmployeeListById() {
        for (int i = 0; i < employeeList.size() - 1; i++) {
            for (int j = i + 1; j < employeeList.size(); j++) {
                Employee employee1 = employeeList.get(i);
                Employee employee2 = employeeList.get(j);
                if (employee1.getId() > employee2.getId()) {
                    employeeList.set(i, employee2);
                    employeeList.set(j, employee1);
                }
            }
        }
    }
}

class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

