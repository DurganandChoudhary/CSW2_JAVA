package labtest;

import java.util.*;

public class rr {
    private static ArrayList<Employee> employeeList = new ArrayList<>();

    public static void main(String[] args) {
        // Add 10 employees to the database
        addEmployee(new Employee(7001, "Anushka"));
        addEmployee(new Employee(7002, "Arpita"));
        addEmployee(new Employee(7003, "Lakshay"));
        addEmployee(new Employee(7004, "Jordan"));
        addEmployee(new Employee(7005, "Naveen"));
        addEmployee(new Employee(7006, "Tyalor"));
        addEmployee(new Employee(7007, "Aryan"));
        addEmployee(new Employee(7008, "Dustin"));
        addEmployee(new Employee(7009, "Sachin"));
        addEmployee(new Employee(7010, "Laxmi"));

        // Display the employee database in ascending order according to id
        System.out.println("Employee Database:");
        sortEmployeeListById();
        for (Employee employee : employeeList) {
            System.out.println("ID: " + employee.getId() + ", Name: " + employee.getName());
        }

        // Search for an employee by id
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee id to search: ");
        int id = scanner.nextInt();
        if (searchEmployee(id)) {
            System.out.println("Employee found in the database!");
        } else {
            System.out.println("Employee not found in the database!");
        }

        // Remove an employee by id
        System.out.print("Enter employee id to remove: ");
        id = scanner.nextInt();
        if (removeEmployee(id)) {
            System.out.println("Employee removed from the database!");
        } else {
            System.out.println("Employee not found in the database!");
        }

        // Show the size of the employee database
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

