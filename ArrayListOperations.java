package b2;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListOperations {

    public static void main(String[] args) {
        
        // Creating an ArrayList of Integer type
        ArrayList<Integer> list = new ArrayList<>();
        
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("\nChoose an option:");
            System.out.println("1. Display the list");
            System.out.println("2. Search for a number in the list");
            System.out.println("3. Remove an element from a position");
            System.out.println("4. Add an element to the list");
            System.out.println("5. Check if the list is empty");
            System.out.println("6. Exit");
            
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    // Display the list
                    if (list.isEmpty()) {
                        System.out.println("The list is empty.");
                    } else {
                        System.out.println("The list is: " + list);
                    }
                    break;
                case 2:
                    // Search for a number in the list
                    if (list.isEmpty()) {
                        System.out.println("The list is empty.");
                    } else {
                        System.out.print("Enter a number to search in the list: ");
                        int searchNumber = scanner.nextInt();
                        if (list.contains(searchNumber)) {
                            System.out.println(searchNumber + " is present in the list.");
                        } else {
                            System.out.println(searchNumber + " is not present in the list.");
                        }
                    }
                    break;
                case 3:
                    // Remove an element from a position
                    if (list.isEmpty()) {
                        System.out.println("The list is empty.");
                    } else {
                        System.out.print("Enter the position of the element to remove (starting from 0): ");
                        int position = scanner.nextInt();
                        if (position >= 0 && position < list.size()) {
                            int removedNumber = list.remove(position);
                            System.out.println("Removed " + removedNumber + " from the list.");
                        } else {
                            System.out.println("Invalid position.");
                        }
                    }
                    break;
                case 4:
                    // Add an element to the list
                    System.out.print("Enter a number to add to the list: ");
                    int numberToAdd = scanner.nextInt();
                    list.add(numberToAdd);
                    System.out.println(numberToAdd + " added to the list.");
                    break;
                case 5:
                    // Check if the list is empty
                    if (list.isEmpty()) {
                        System.out.println("The list is empty.");
                    } else {
                        System.out.println("The list is not empty.");
                    }
                    break;
                case 6:
                    // Exit the program
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
            
        } while (choice != 6);
        
        scanner.close();
    }
}
