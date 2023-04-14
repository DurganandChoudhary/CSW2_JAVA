package karan;

import java.util.*;

public class p27 {

	public static void main(String[] args) {
	
				PriorityQueue<Integer> que =new PriorityQueue<Integer>(Collections.reverseOrder());
				que.add(5);
				que.add(1);
				que.add(2);
				que.add(3);
				System.out.println("Queue :" +que);
				System.out.println("Queue size :"+que.size());
				System.out.println("Queue peek :"+que.peek());
				System.out.println("Queue remove :"+que.remove());
				System.out.println("Queue remove :"+que.remove());
				System.out.println("Queue isEmpty :"+que.isEmpty());
				System.out.println("Queue :" +que);
			}


	}
