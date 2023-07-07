package April21_2023;

public class q5 {

    public static void sortAccordingToOrder(int[] arr1, int[] arr2) {
        int index = 0;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]) {
                    int temp = arr1[index];
                    arr1[index] = arr1[j];
                    arr1[j] = temp;
                    index++;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,3,4,4,5,7,9};
        int[] arr2 = {5, 4, 3, 2, 1};
        System.out.println("Before sorting: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        sortAccordingToOrder(arr1, arr2);
        System.out.println("\nAfter sorting: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
