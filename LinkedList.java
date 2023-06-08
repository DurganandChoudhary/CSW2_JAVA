package SingleLinkedList;

public class LinkedList {
	private static class Node {
		 private int value;
		 private Node next;
		 public Node(int v, Node n) {
		 value = v;
		 next = n;
		 }
		public boolean isEmpty() {
			return false;
		}
		 }
		 private Node head;
		 private int size = 0;

		 public void add(int value) {
	            Node newNode = new Node(value, null);
	            if (head == null) {
	                head = newNode;
	            } else {
	                Node current = head;
	                while (current.next != null) {
	                    current = current.next;
	                }
	                current.next = newNode;
	            }
	            size++;
	        }

	        public void printList() {
	            Node current = head;
	            while (current != null) {
	                System.out.print(current.value + " ");
	                current = current.next;
	            }
	            System.out.println();
	        }
	        public boolean searchList(int data) {
	        	 Node temp = head;
	        	 while (temp != null) {
	        	 if (temp.value == data)
	        	 return true;
	        	 temp = temp.next;
	        	 }
	        	 return false;
	        	}
	        public boolean isEmpty() {
	            return head == null;
	        }
	        public boolean deleteNode(int delValue) {
	        	 Node temp = head;
	        	 if (isEmpty())
	        	 return false;
	        	 if (delValue == head.value) {
	        	 head = head.next;
	        	 size--;
	        	 return true;
	        	 }
	        	 while (temp.next != null) {
	        	 if (temp.next.value == delValue) {
	        	 temp.next = temp.next.next;
	        	 size--;
	        	 return true;
	        	 }
	        	 temp = temp.next;
	        	 }
	        	 return false;
	        	}
	        public void deleteNodes(int delValue) {
	        	 Node currNode = head;
	        	 Node nextNode;
	        	 while (currNode != null && currNode.value == delValue)/* first node
	        	*/
	        	 {
	        	 head = currNode.next;
	        	 currNode = head;
	        	 }
	        	 while (currNode != null) {
	        	 nextNode = currNode.next;
	        	 if (nextNode != null && nextNode.value == delValue) {
	        	 currNode.next = nextNode.next;
	        	 } else {
	        	 currNode = nextNode;
	        	 }
	        	 }
	        	}
	        public void reverse() {
	        	 Node curr = head;
	        	 Node prev = null;
	        	 Node next = null;
	        	 while (curr != null) {
	        	 next = curr.next;
	        	 curr.next = prev;
	        	 prev = curr;
	        	 curr = next;
	        	 }
	        	 head = prev;
	        	}
	        public LinkedList copyListReversed() {
	        	 Node tempNode = null;
	        	 Node tempNode2 = null;
	        	 Node curr = head;
	        	 while (curr != null) {
	        	 tempNode2 = new Node(curr.value, tempNode);
	        	 curr = curr.next;
	        	 tempNode = tempNode2;
	        	 }
	        	 LinkedList ll2 = new LinkedList();
	        	 ll2.head = tempNode;
	        	 return ll2;
	        	}
	        public LinkedList copyList() {
	        	 Node headNode = null;
	        	 Node tailNode = null;
	        	 Node tempNode = null;
	        	 Node curr = head;
	        	 if (curr == null)
	        	 return null;
	        	 headNode = new Node(curr.value, null);
	        	 tailNode = headNode;
	        	 curr = curr.next;
	        	 while (curr != null) {
	        	 tempNode = new Node(curr.value, null);
	        	 tailNode.next = tempNode;
	        	 tailNode = tempNode;
	        	 curr = curr.next;
	        	 }
	        	 LinkedList ll2 = new LinkedList();
	        	 ll2.head = headNode;
	        	 return ll2;
	        	}
	        public int findLength() {
	        	 Node curr = head;
	        	 int count = 0;
	        	 while (curr != null) {
	        	 count++;
	        	 curr = curr.next;
	        	 }
	        	 return count;
	        	}

	        
	        
	        public boolean loopDetect() {
	        	 Node slowPtr;
	        	 Node fastPtr;
	        	 slowPtr = fastPtr = head;
	        	 while (fastPtr.next != null && fastPtr.next.next != null) {
	        	 slowPtr = slowPtr.next;
	        	 fastPtr = fastPtr.next.next;
	        	 if (slowPtr == fastPtr) {
	        	 System.out.println("loop found");
	        	 return true;
	        	 }
	        	 }
	        	 System.out.println("loop not found");
	        	 return false;
	        	}
	        
	        
	        
	        
	        
	        
	    public static void main(String[] args) {
	        LinkedList list = new LinkedList();

	        // Adding elements to the list
	        list.add(5);
	        list.add(10);
	        list.add(15);
	        list.add(20);
	        list.add(25);
	        list.add(10);
	        list.add(15);
	       
	        // Printing the elements of the list
	        System.out.println("\nPrint List :");
	        list.printList();
	        // Searching the elements of the list
	        System.out.println("\nSearch 20 : "+ list.searchList(20));
	        //Delete a particular node from the List
	        boolean deleted = list.deleteNode(10);
	        System.out.println("\nNode deleted 10 : " + deleted);
	        list.printList();
	        //Delete all the occurrence of particular value
	        list.deleteNodes(15);
	        System.out.println("\nList after deleting nodes with value 15:");
	        list.printList();
	        // Reversing the list
	        list.reverse();
	        // Printing the reversed list
	        System.out.println("\nReversed List:");
	        list.printList();
	        // Copying and reversing the list
	        LinkedList reversedList = list.copyListReversed();

	        // Printing the reversed list
	        System.out.println("\nReversed List:");
	        reversedList.printList();
	        // Copying the list
	        LinkedList copiedList = list.copyList();

	        // Printing the copied list
	        System.out.println("\nCopied List:");
	        copiedList.printList();
	        // Call the findLength() method
	        int length = list.findLength();

	        // Print the length of the linked list
	        System.out.println("\nLength of the linked list: " + length);
	        
	        
	        
	        
	    }
	}