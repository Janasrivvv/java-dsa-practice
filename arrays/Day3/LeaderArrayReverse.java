/*
Problem: Leaders in Array (Optimized)
Variation: Print Leaders in Reverse Order (rightmost → leftmost)
Approach: Traverse from right, track current maximum, add leaders to list
TC: O(n) | SC: O(n)  (for storing leaders)
*/

import java.util.*;

public class LeaderArrayReverse {
    public static void main(String[] args) {
        int[] arr = {9, 8, 10, 4, 2, 1, 3, 5, 1};
        int n = arr.length;

        List<Integer> leaders = new ArrayList<>();
        int max = arr[n - 1];

        leaders.add(max); // last element is always a leader
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > max) {
                leaders.add(arr[i]);
                max = arr[i];
            }
        }

        System.out.println("Leaders in reverse order: " + leaders);
    }
}
