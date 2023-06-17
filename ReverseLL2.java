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

    void reverse() {
        Node prevNode = null;
        Node currentNode = head;
        Node nextNode = null;

        while (currentNode != null) {
            nextNode = currentNode.next; // Store the next node
            currentNode.next = prevNode; // Reverse the link

            // Move pointers one position ahead
            prevNode = currentNode;
            currentNode = nextNode;
        }

        head = prevNode; // Update the head to the last node
    }
}

public class ReverseLL2 {
    public static void main(String[] args) {
        // Create the linked list
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);

        // Display the original list
        System.out.println("Original List:");
        list.display();

        // Reverse the list
        list.reverse();

        // Display the reversed list
        System.out.println("Reversed List:");
        list.display();
    }
}
