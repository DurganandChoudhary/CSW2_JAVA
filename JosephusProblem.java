
import java.util.LinkedList;
import java.util.Queue;

public class JosephusProblem {

    public static int josephus(int n, int k) {
        Queue<Integer> queue = new LinkedList<>();

        // Populate the queue with numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        while (queue.size() > 1) {
            // Remove k-1 elements from the front of the queue and add them to the back
            for (int i = 0; i < k - 1; i++) {
                int front = queue.poll();
                queue.add(front);
            }

            // Remove the k-th element from the front of the queue
            queue.poll();
        }

        // Return the remaining element in the queue (the survivor)
        return queue.poll();
    }

    // Main method to test the program
    public static void main(String[] args) {
        int n = 7; // Number of people
        int k = 3; // Step size

        int survivor = josephus(n, k);
        System.out.println("The survivor is: " + survivor);
    }
}
