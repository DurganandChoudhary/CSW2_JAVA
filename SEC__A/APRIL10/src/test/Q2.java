package test;
import java.util.Arrays;
public class Q2 {
    public static void main(String[] args) {
        int[] input = {2, 3, 4, 5, 6, 7, 12};
        int[] output = rearrange(input);
        System.out.println("Reversed array is:"+Arrays.toString(output));
    }

    public static int[] rearrange(int[] arr) {
        int[] output = new int[arr.length];
        int left = 0;
        int right = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                output[i] = arr[right--];
            } else {
                output[i] = arr[left++];
            }
        }

        return output;
    }
}

