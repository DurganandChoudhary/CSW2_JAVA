package CircularLinkedList;

public class CircularLinkedList {
	private Node tail;
	 private int size = 0;
	 private static class Node {
	 private int value;
	 private Node next;
	 public Node(int v, Node n) {
	 value = v;
	 next = n;
	 }
	 public Node(int v) {
	 value = v;
	 next = null;
	 	}
	 }
	 
	

	 public void print() {
		 if (isEmpty()) {
		 return;
		 }
		 Node temp = tail.next;
		 while (temp != tail) {
		 System.out.print(temp.value + "-> ");
		 temp = temp.next;
		 }
		 System.out.println(temp.value + "  ");
		}

	


public boolean isEmpty() {
	if(size == 0)
		return true;
	else
		return false;
}
public boolean searchList(int data) {
	 Node temp = tail;
	 for (int i = 0; i < size; i++) {
	 if (temp.value == data)
	 return true;
	 temp = temp.next;
	 }
	 return false;
	}
public int removeHead() throws IllegalStateException {
	 if (isEmpty()) {
	 throw new IllegalStateException("EmptyListException");
	 }
	 int value = tail.next.value;
	 if (tail == tail.next)
	 tail = null;
	 else
	 tail.next = tail.next.next;
	 size--;
	 return value;
	}

public void addTail(int value) {
	 Node temp = new Node(value, null);
	 if (isEmpty()) {
	 tail = temp;
	 temp.next = temp;
	 } else {
	 temp.next = tail.next;
	 tail.next = temp;
	 tail = temp;
	 }
	 size++;
	}

public void addHead(int value) {
	 Node temp = new Node(value, null);
	 if (isEmpty()) {
	 tail = temp;
	 temp.next = temp;
	 } else {
	 temp.next = tail.next;
	 tail.next = temp;
	 }
	 size++;
	}
public void deleteList() {
	 tail = null;
	 size = 0;
	}
	public static void main(String[] args) {
	 CircularLinkedList ll = new CircularLinkedList();
	 ll.addHead(1);
	 ll.addHead(2);
	 ll.addHead(3);
	 ll.addHead(4);
	 ll.addHead(5);
	 ll.addHead(6);
	 ll.addTail(0);
	 System.out.println("\nPrint List ");
	 ll.print();
	 System.out.println("\nremove node 3");
	 ll.removeNode(3);
	 ll.print();
	 System.out.println("\nIs the searched element present ?  ");
	 System.out.println(ll.searchList(0));
	 ll.removeHead();
	 System.out.println("\nremove head");
	 ll.print();
	 System.out.println("\n List Deleted");
	 ll.deleteList();
	 ll.print();
	 System.out.println("\n List Reversed");
	 ll.copyListReversed();
	 ll.print();
	}
	public CircularLinkedList copyListReversed() {
		 CircularLinkedList cl = new CircularLinkedList();
		 Node curr = tail.next;
		 Node head = curr;
		 if (curr != null) {
		 cl.addHead(curr.value);
		 curr = curr.next;
		 }
		 while (curr != head) {
		 cl.addHead(curr.value);
		 curr = curr.next;
		 }
		 return cl;
		}
	public boolean removeNode(int key) {
		 if (isEmpty()) {
		 return false;
		 }
		 Node prev = tail;
		 Node curr = tail.next;
		 Node head = tail.next;
		 if (curr.value == key)// head and single node case.
		 {
		 if (curr == curr.next)// single node case
		 tail = null;
		 else // head case
		 tail.next = tail.next.next;
		 return true;
		 }
		 prev = curr;
		 curr = curr.next;
		 while (curr != head) {
		 if (curr.value == key) {
		 if (curr == tail)
		 tail = prev;
		 prev.next = curr.next;
		 return true;
		 }
		 prev = curr;
		 curr = curr.next;
		 }
		 return false;
		}

	}


/* public void add(int value) {
		    Node newNode = new Node(value);
		    if (tail == null) {
		        tail = newNode;
		        tail.next = tail;
		    } else {
		        newNode.next = tail.next;
		        tail.next = newNode;
		        tail = newNode;
		    }
		    size++;
		}
*/

/*public void print() {
    if (isEmpty()) {
        System.out.println("List is empty.");
        return;
    }

    Node current = tail.next;
    while (current != tail) {
        System.out.print(current.value + " -> ");
        current = current.next;
    }
    System.out.println(current.value + " -> " + current.next.value);
}
*/




/*public void add(int value) {
    Node newNode = new Node(value);
    if (tail == null) {
        tail = newNode;
        tail.next = tail;
    } else {
        newNode.next = tail.next;
        tail.next = newNode;
        tail = newNode;
    }
    size++;
}
 * 
 * 
 * public void display() {
    if (tail == null) {
        System.out.println("List is empty.");
        return;
    }
    Node current = tail.next;
    while (current != tail) {
        System.out.print(current.value + " -> ");
        current = current.next;
    }
    System.out.println(current.value + " -> " + current.next.value);
}


 * 
 * public void remove(int value) {
    if (tail == null) {
        return;
    }

    Node current = tail.next;
    Node previous = tail;

    while (current != tail) {
        if (current.value == value) {
            previous.next = current.next;
            size--;
            return;
        }
        previous = current;
        current = current.next;
    }
}
 * 
 * public static void main(String[] args) {
    CircularLinkedList list = new CircularLinkedList();

    // Add elements to the list
    list.add(10);
    list.add(20);
    list.add(30);

    // Display the list
    System.out.println("Initial List:");
    list.display();

    // Remove an element from the list
    list.remove(20);

    // Display the updated list
    System.out.println("Updated List:");
    list.display();
}
}*/

/* 
	 public void remove(int value) {
		    if (tail == null) {
		        return;
		    }

		    Node current = tail.next;
		    Node previous = tail;

		    while (current != tail) {
		        if (current.value == value) {
		            previous.next = current.next;
		            size--;
		            return;
		        }
		        previous = current;
		        current = current.next;
		    }
		}*/
