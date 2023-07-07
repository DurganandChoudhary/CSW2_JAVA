import java.util.HashMap;

public class q11 {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15, 3, 6}; // example array
        int value = 9; // example value
        int[] result = findTwoElementsWithSum(arr, value);
        if (result != null) {
            System.out.println("The two elements with sum " + value + " are: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No two elements with sum " + value + " found in the array.");
        }
    }

    public static int[] findTwoElementsWithSum(int[] arr, int value) {
        Map<Integer, Integer> map = new HashMap<Integer,Integer>();
        for (int i = 0; i < arr.length; i++) {
            int complement = value - arr[i];
            if (map.containsKey(complement)) {
                return new int[]{arr[i], complement};
            }
            map.put(arr[i], i);
        }
        return null;
    }
}
