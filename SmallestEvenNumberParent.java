public class SmallestEvenNumberParent {
    public static int findParentOfSmallestEven(int[] numbers) {
        int smallestEven = Integer.MAX_VALUE;
        int parentIndex = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0 && numbers[i] < smallestEven) {
                smallestEven = numbers[i];
                parentIndex = i;
            }
        }

        if (parentIndex != -1) {
            int parent = parentIndex / 2;
            return parent;
        } else {
            return -1; // No even number found
        }
    }

    public static void main(String[] args) {
        int[] numbers = { 5, 8, 2, 12, 3, 6 };
        int parent = findParentOfSmallestEven(numbers);

        if (parent != -1) {
            System.out.println("The parent index of the smallest even number is: " + parent);
        } else {
            System.out.println("No even number found in the array.");
        }
    }
}
