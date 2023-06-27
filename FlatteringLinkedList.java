import java.util.PriorityQueue;

// Node class
class Node {
	int data;
	Node next;
	Node bottom;
	Node(int data)
	{
		this.data = data;
		next = null;
		bottom = null;
	}
}

// Comparator class to sort nodes in a priority queue
class NodeComparator implements java.util.Comparator<Node> {
	@Override public int compare(Node a, Node b)
	{
		return a.data - b.data;
	}
}

public class FlatteringLinkedList {
	// Function to flatten the linked list
	public static void flatten(Node root)
	{

		// Priority queue to store nodes
		PriorityQueue<Node> pq
			= new PriorityQueue<Node>(new NodeComparator());

		// Adding main linked list nodes into priority queue
		while (root != null) {
			pq.add(root);
			root = root.next;
		}

		// Extracting the minimum node
		// while priority queue is not empty
		while (!pq.isEmpty()) {
			// Extracting the minimum node
			Node k = pq.poll();

			// Printing the node data
			System.out.print(k.data + " ");
			if (k.bottom != null) {
				pq.add(k.bottom);
			}
		}
	}

	public static void main(String[] args)
	{
		Node head = new Node(5);
		Node temp = head;
		Node bt = head;

		bt.bottom = new Node(7);
		bt.bottom.bottom = new Node(8);
		bt.bottom.bottom.bottom = new Node(30);

		temp.next = new Node(10);
		temp = temp.next;

		bt = temp;
		bt.bottom = new Node(20);

		temp.next = new Node(19);
		temp = temp.next;

		bt = temp;
		bt.bottom = new Node(22);
		bt.bottom.bottom = new Node(50);

		temp.next = new Node(28);
		temp = temp.next;

		bt = temp;
		bt.bottom = new Node(35);
		bt.bottom.bottom = new Node(40);
		bt.bottom.bottom.bottom = new Node(45);

		// Calling function to flatten the linked list
		flatten(head);
	}
}
