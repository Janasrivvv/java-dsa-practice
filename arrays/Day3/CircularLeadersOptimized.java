/*
Problem: Leaders in Circular Array
Variation: Optimized (Only maximum elements can be leaders in circular array)
Approach: Find maximum element(s), print them
TC: O(n) | SC: O(1)
*/

public class CircularLeadersOptimized {
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1};
        int n = arr.length;

        // find the maximum element
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.print("Leaders in Circular Array (Optimized): ");
        for (int i = 0; i < n; i++) {
            if (arr[i] == max) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
