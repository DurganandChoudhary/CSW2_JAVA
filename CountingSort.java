public class CountingSort {
    public static void countingSort(int[] arr) {
        int max = getMaxValue(arr);
        int[] count = new int[max + 1];
        int[] sortedArr = new int[arr.length];

        // Count occurrences of each element
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // Calculate cumulative count
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        // Build the sorted array
        for (int i = arr.length - 1; i >= 0; i--) {
            sortedArr[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        // Copy the sorted array back to the original array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sortedArr[i];
        }
    }

    private static int getMaxValue(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 8, 3, 3, 1};
        System.out.println("Original array: " + Arrays.toString(arr));

        countingSort(arr);

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
