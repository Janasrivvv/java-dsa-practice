/*
Problem: Maximum Consecutive Ones in a Binary Array
Approach: Linear scan, count consecutive 1s, track max
TC: O(n) | SC: O(1)
*/

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1, 0, 1, 1, 1, 1};
        int count = 0, max_count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
            } else {
                count = 0;
            }
            max_count = Math.max(max_count, count);
        }

        System.out.println("Maximum consecutive ones: " + max_count);
    }
}
