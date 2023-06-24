import java.util.function.Function;

public class TernarySearch {

    public static double ternarySearch(double left, double right, double epsilon, Function<Double, Double> function) {
        while (right - left > epsilon) {
            double mid1 = left + (right - left) / 3;
            double mid2 = right - (right - left) / 3;

            double fMid1 = function.apply(mid1);
            double fMid2 = function.apply(mid2);

            if (fMid1 < fMid2) {
                left = mid1;
            } else {
                right = mid2;
            }
        }

        return (left + right) / 2;
    }

    public static void main(String[] args) {
        // Example usage
        double left = -10.0;  // Left endpoint of the search interval
        double right = 10.0;  // Right endpoint of the search interval
        double epsilon = 1e-9;  // Small threshold for terminating the search
        Function<Double, Double> function = x -> x * x;  // The function to optimize (e.g., x^2)

        double result = ternarySearch(left, right, epsilon, function);
        System.out.println("Approximate maximum value: " + result);
    }
}
