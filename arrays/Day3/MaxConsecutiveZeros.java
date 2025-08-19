/*
Problem: Maximum Consecutive Zeros in a Binary Array
Variation: Maximum consecutive ones, maximum consecutive elements ≥ k
Approach: Linear scan, count consecutive 0s, reset on 1, track max
TC: O(n) | SC: O(1)
*/

public class MaxConsecutiveZeros {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1};
        int count = 0, max_count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
            } else {
                count = 0;
            }
            max_count = Math.max(max_count, count);
        }

        System.out.println("Maximum consecutive zeros: " + max_count);
    }
}
