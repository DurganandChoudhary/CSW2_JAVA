import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMaximum {

    public static void findMaximumInSlidingWindow(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }

        int n = nums.length;
        if (n < 3) {
            System.out.println("Invalid input: Array length is less than 3");
            return;
        }

        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            // Remove elements that are out of the current window from the front of the
            // deque
            while (!deque.isEmpty() && deque.peekFirst() < i - 2) {
                deque.pollFirst();
            }

            // Remove elements that are smaller than the current element from the rear of
            // the deque
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }

            deque.offerLast(i);

            // If the current index has reached the window size, print the maximum element
            if (i >= 2) {
                System.out.println(nums[deque.peekFirst()]);
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = { 1, 3, -1, -3, 5, 3, 6, 7 };
        findMaximumInSlidingWindow(nums);
    }
}
