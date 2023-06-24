public class BitonicSort {

    public static void bitonicSort(int[] arr) {
        bitonicSortRecursive(arr, 0, arr.length, true);
    }

    private static void bitonicSortRecursive(int[] arr, int start, int length, boolean ascending) {
        if (length > 1) {
            int mid = length / 2;
            bitonicCompare(arr, start, length, ascending);

            bitonicSortRecursive(arr, start, mid, ascending);
            bitonicSortRecursive(arr, start + mid, mid, !ascending);
        }
    }

    private static void bitonicCompare(int[] arr, int start, int length, boolean ascending) {
        int k = length / 2;
        for (int i = start; i < start + k; i++) {
            compareAndSwap(arr, i, i + k, ascending);
        }
    }

    private static void compareAndSwap(int[] arr, int i, int j, boolean ascending) {
        if ((arr[i] > arr[j] && ascending) || (arr[i] < arr[j] && !ascending)) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 2, 1, 4, 9, 6, 7};
        System.out.println("Before sorting: " + Arrays.toString(arr));

        bitonicSort(arr);

        System.out.println("After sorting: " + Arrays.toString(arr));
    }
}
