package Q4;

import java.util.*;

public class PriorityQueue1 {
	public static void main(String... ar) {

		PriorityQueue<Integer> priorityQ = new PriorityQueue<Integer>();

		priorityQ.offer(4);
		priorityQ.offer(1);
		priorityQ.offer(5);
		priorityQ.add(2);
		priorityQ.add(3);

		System.out.println("PriorityQueue contents may appear out-of-order : " + priorityQ);

		System.out.print("PriorityQueue in an ascending ordering using poll() method : ");

		for (Integer i = priorityQ.poll(); i != null; i = priorityQ.poll()) {
			System.out.print(i + " ");
		}
	}

}