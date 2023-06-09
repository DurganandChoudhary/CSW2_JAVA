// Java program to find minimum
// initial energy to reach end

class MinimumEnergy {

    // Function to calculate minimum
    // initial energy arr[] stores energy
    // at each checkpoints on street
    static int minInitialEnergy(int arr[], int n) {
        // initMinEnergy is variable to store
        // minimum initial energy required.
        int initMinEnergy = 0;

        // currEnergy is variable to store
        // current value of energy at
        // i'th checkpoint on street
        int currEnergy = 0;

        // flag to check if we have successfully
        // crossed the street without any energy
        // loss <= o at any checkpoint
        boolean flag = false;

        // Traverse each check point linearly
        for (int i = 0; i < n; i++) {
            currEnergy += arr[i];

            // If current energy, becomes negative or 0,
            // increment initial minimum energy by the negative
            // value plus 1. to keep current energy
            // positive (at least 1). Also
            // update current energy and flag.
            if (currEnergy <= 0) {
                initMinEnergy += Math.abs(currEnergy) + 1;
                currEnergy = 1;
                flag = true;
            }
        }

        // If energy never became negative or 0, then
        // return 1. Else return computed initMinEnergy
        return (flag == false) ? 1 : initMinEnergy;
    }

    // Driver code
    public static void main(String[] args) {
        int arr[] = { 4, -10, 4, 4, 4 };
        int n = arr.length;
        System.out.print(minInitialEnergy(arr, n));
    }
}