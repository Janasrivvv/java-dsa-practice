/*
Problem: Maximum Consecutive Elements ≥ k
Variation: Maximum consecutive ones/zeros
Approach: Linear scan, count consecutive elements ≥ k, reset if not, track max
TC: O(n) | SC: O(1)
*/

public class MaxConsecutiveGEK {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 1, 7, 8, 3, 9};
        int k = 5;
        int count = 0, max_count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= k) {
                count++;
            } else {
                count = 0;
            }
            max_count = Math.max(max_count, count);
        }

        System.out.println("Maximum consecutive elements ≥ " + k + ": " + max_count);
    }
}
