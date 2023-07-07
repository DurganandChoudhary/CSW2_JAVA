package Q1;

public class CountingSort {

	public static void countingSort(int[] arr, int minVal, int maxVal) {
		int size = arr.length;
		int range = maxVal - minVal + 1;
		int[] count = new int[range];
		int[] output = new int[size];

		for (int i = 0; i < size; i++) {
			count[arr[i] - minVal]++;
		}

		for (int i = 1; i < range; i++) {
			count[i] += count[i - 1];
		}

		for (int i = size - 1; i >= 0; i--) {
			output[count[arr[i] - minVal] - 1] = arr[i];
			count[arr[i] - minVal]--;
		}

		for (int i = 0; i < size; i++) {
			arr[i] = output[i];
		}
	}

	public static void main(String[] args) {
		int[] arr = { 57, 29, 90, 101, 95, 76 };
		int minVal = 29;
		int maxVal = 101;

		countingSort(arr, minVal, maxVal);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}