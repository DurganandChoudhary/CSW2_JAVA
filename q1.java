package April10_2023;

public class q1 {

    void selectionsort(int arr[])
    {int n = arr.length;
    for (int i = 0; i < n-1; i++)
        {int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
    void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                   
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }
    void insertionsort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static void main(String args[])
    {
        q1 ob = new q1();
        int arr[] = {64,25,12,22,11};
        System.out.println("UnSorted array");
        ob.printArray(arr);
        //Selection Sort
        ob.selectionsort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
        //bubble sort
        ob.bubbleSort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
        //insertion sort
        ob.insertionsort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}
