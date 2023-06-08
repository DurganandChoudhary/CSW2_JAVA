import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConvertXY {

    public static List<Integer> convertXtoY(int X, int Y) {
        List<Integer> steps = new ArrayList<>();

        while (Y > X) {
            if (Y % 2 == 0 && Y > X) {
                Y /= 2;
                steps.add(Y);
            } else {
                Y -= 1;
                steps.add(Y);
            }
        }

        Collections.reverse(steps);
        return steps;
    }

    public static void main(String[] args) {
        int X = 5;
        int Y = 28;

        List<Integer> steps = convertXtoY(X, Y);

        if (steps.get(steps.size() - 1) == X) {
            System.out.println("Steps to convert " + X + " to " + Y + ":");
            for (int step : steps) {
                System.out.print(step + " ");
            }
        } else {
            System.out.println("Conversion not possible.");
        }
    }
}
