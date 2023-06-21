
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.LinkedList;
public class ConvertXtoY {
    public static int convert(int X, int Y) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        
        queue.offer(X);
        visited.add(X);
        int steps = 0;
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            
            for (int i = 0; i < size; i++) {
                int curr = queue.poll();
                
                if (curr == Y)
                    return steps;
                
                // Multiply by 2
                int mult = curr * 2;
                if (!visited.contains(mult) && mult <= Y) {
                    queue.offer(mult);
                    visited.add(mult);
                }
                
                // Subtract 1
                int sub = curr - 1;
                if (!visited.contains(sub) && sub > 0) {
                    queue.offer(sub);
                    visited.add(sub);
                }
            }
            
            steps++;
        }
        
        return -1; // Y cannot be reached from X
    }
    
    public static void main(String[] args) {
        int X = 5;
        int Y = 17;
        
        int steps = convert(X, Y);
        
        if (steps != -1)
            System.out.println("Minimum number of steps to convert " + X + " to " + Y + ": " + steps);
        else
            System.out.println("Y cannot be reached from X");
    }
}
