package Q1B;



public class RecursionFind {


   public static boolean search(int[] arr, int value) {
       return searchHelper(arr, value, 0, arr.length - 1);
   }

   private static boolean searchHelper(int[] arr, int value, int start, int end) {
       if (start > end) {
           return false; 
       }

       int mid = start + (end - start) / 2; 

       if (arr[mid] == value) {
           return true; 
       } else if (arr[mid] > value) {
           return searchHelper(arr, value, start, mid - 1); 
       } else {
           return searchHelper(arr, value, mid + 1, end); 
       }
   }

   public static void main(String[] args) {
       int[] arr = {1, 3, 5, 7, 9};
       int value = 7;
       if (search(arr, value)) {
           System.out.println(value + " found in array.");
       } else {
           System.out.println(value + " not found in array.");
       }
   }
}
