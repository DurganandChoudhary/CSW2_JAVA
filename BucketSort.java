package Q2;
import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {
	public static void bucketSort(double[] arr) {
		int n = arr.length;
		ArrayList<Double>[] buckets = new ArrayList[n];

		for (int i = 0; i < n; i++) {
			buckets[i] = new ArrayList<Double>();
		}

		for (int i = 0; i < n; i++) {
			int bucketIndex = (int) (n * arr[i]);
			buckets[bucketIndex].add(arr[i]);
		}

		int index = 0;
		for (int i = 0; i < n; i++) {
			Collections.sort(buckets[i]);
			for (int j = 0; j < buckets[i].size(); j++) {
				arr[index++] = buckets[i].get(j);
			}
		}
	}

	public static void main(String[] args) {
		double[] arr = { 0.42, 0.32, 0.84, 0.95, 0.11, 0.63 };
		bucketSort(arr);
		System.out.println("Sorted array:");
		for (double num : arr) {
			System.out.print(num + " ");
		}
	}
}
