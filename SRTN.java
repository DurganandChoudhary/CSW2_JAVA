package q3;
import java.util.*;

public class SRTN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of processes: ");
        int n = sc.nextInt();
        int[] bt = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the burst time for process " + (i+1) + ": ");
            bt[i] = sc.nextInt();
        }

        int[] remainingTime = new int[n];
        for (int i = 0; i < n; i++) {
            remainingTime[i] = bt[i];
        }

        int t = 0;
        boolean[] completed = new boolean[n];
        int numCompleted = 0;
        List<Integer> sequence = new ArrayList<>();

        while (numCompleted < n) {
            int shortest = -1;
            for (int i = 0; i < n; i++) {
                if (!completed[i] && remainingTime[i] > 0) {
                    if (shortest == -1 || remainingTime[i] < remainingTime[shortest]) {
                        shortest = i;
                    }
                }
            }

            if (shortest == -1) {
                t++;
                continue;
            }

            sequence.add(shortest);
            remainingTime[shortest]--;
            t++;

            if (remainingTime[shortest] == 0) {
                completed[shortest] = true;
                numCompleted++;
            }
        }

        System.out.println("Scheduling sequence using SRTN:");
        for (int i : sequence) {
            System.out.print("P" + (i+1) + " ");
        }
    }
}