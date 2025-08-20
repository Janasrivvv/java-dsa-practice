/*
Problem: Leaders in Circular Array
Variation: Brute Force (Check every element circularly against all others)
Approach: For each element, check all other elements using modulo indexing
TC: O(n^2) | SC: O(1)
*/

public class CircularLeadersBrute {
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1};
        int n = arr.length;

        System.out.print("Leaders in Circular Array (Brute Force): ");
        for (int i = 0; i < n; i++) {
            boolean isLeader = true;

            // check circularly against all other elements
            for (int j = 1; j < n; j++) {
                int idx = (i + j) % n; // wrap around
                if (arr[i] < arr[idx]) {
                    isLeader = false;
                    break;
                }
            }

            if (isLeader) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
