class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

class LinkedList {
    Node head;

    LinkedList() {
        head = null;
    }

    void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    void display() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    LinkedList copy() {
        LinkedList newList = new LinkedList();
        Node currentNode = head;
        while (currentNode != null) {
            newList.append(currentNode.data);
            currentNode = currentNode.next;
        }
        return newList;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create the original linked list
        LinkedList originalList = new LinkedList();
        originalList.append(1);
        originalList.append(2);
        originalList.append(3);
        originalList.append(4);
        originalList.append(5);

        // Display the original list
        System.out.println("Original List:");
        originalList.display();

        // Copy the original list to a new list
        LinkedList newList = originalList.copy();

        // Display the new list
        System.out.println("Copied List:");
        newList.display();
    }
}
