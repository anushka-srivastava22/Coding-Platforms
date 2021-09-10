/*
    Time Complexity : O(N^2)
    Space Complexity : O(1)

    Where N is the number of elements in the array.
*/

public class Solution {

    public static long[] getProductArray(int arr[], int n) {

        long[] p = new long[n];
        if (n == 1) {
            p[0] = 0;
            return p;
        }

        for (int i = 0; i < n; i++) {
            long currentProduct = 1;

            for (int j = 0; j < n; j++) {
                if (i != j) {
                    currentProduct *= arr[j];
                }
            }

            p[i] = currentProduct;
        }

        return p;
    }
}
