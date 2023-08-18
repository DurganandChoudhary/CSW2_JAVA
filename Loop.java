package SingleLinkedList;

public class Loop {

	    private Node head;

	    // Node class
	    private class Node {
	        int data;
	        Node next;

	        Node(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }

	    public boolean loopDetect() {
	        Node slowPtr;
	        Node fastPtr;
	        slowPtr = fastPtr = head;

	        while (fastPtr.next != null && fastPtr.next.next != null) {
	            slowPtr = slowPtr.next;
	            fastPtr = fastPtr.next.next;

	            if (slowPtr == fastPtr) {
	                System.out.println("Loop found");
	                return true;
	            }
	        }

	        System.out.println("Loop not found");
	        return false;
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
	    
	    public boolean reverseListLoopDetect() {
	    	 Node tempHead = head;
	    	 reverse();
	    	 if (tempHead == head) {
	    	 reverse();
	    	 System.out.println("loop found");
	    	 return true;
	    	 } else {
	    	 reverse();
	    	 System.out.println("loop not found");
	    	 return false;
	    	 }
	    	}
	    
	    public int loopTypeDetect() {
	    	 Node slowPtr;
	    	 Node fastPtr;
	    	 slowPtr = fastPtr = head;
	    	 while (fastPtr.next != null && fastPtr.next.next != null) {
	    	 if (head == fastPtr.next || head == fastPtr.next.next) {
	    	 System.out.println("circular list loop found");
	    	 return 2;
	    	 }
	    	 slowPtr = slowPtr.next;
	    	 fastPtr = fastPtr.next.next;
	    	 if (slowPtr == fastPtr) {
	    	 System.out.println("loop found");
	    	 return 1;
	    	 }
	    	 }
	    	 System.out.println("loop not found");
	    	 return 0;
	    }

	    public static void main(String[] args) {
	        // Create a linked list
	        Loop list = new Loop();

	        // Add elements to the linked list
	        list.head = list.new Node(1);
	        list.head.next = list.new Node(2);
	        list.head.next.next = list.new Node(3);
	        list.head.next.next.next = list.new Node(4);
	        list.head.next.next.next.next = list.head.next; // Create a loop

	        // Call the loopDetect() method
	        boolean hasLoop = list.loopDetect();

	        // Print the result
	        System.out.println("\nHas loop: " + hasLoop);
	        
	        
	        // Call the reverseListLoopDetect() method
	        boolean loopDetect= list.reverseListLoopDetect();

	        // Print the result
	        System.out.println("\nHas loop: " + loopDetect);
	        
	        
	        
	        list.head.next.next.next.next = list.head;

	        // Call the loopTypeDetect() method
	        int loopType = list.loopTypeDetect();

	        // Print the loop type
	        switch (loopType) {
	            case 0:
	                System.out.println("\nLoop type: No Loop");
	                break;
	            case 1:
	                System.out.println("\nLoop type: Loop");
	                break;
	            case 2:
	                System.out.println("\nLoop type: Circular List Loop");
	                break;
	            default:
	                System.out.println("\nInvalid loop type");
	        }
	    }
	}

