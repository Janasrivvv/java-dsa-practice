/*
Problem: Leaders in an Array
Variation: Optimized approach (Right-to-Left traversal)
Approach: Traverse array from right, keep track of max so far. 
          If current element ≥ max, it is a leader. 
          Collect and reverse at the end.
TC: O(n) | SC: O(n) (for storing leaders) 
         O(1) if we print directly instead of storing
*/

import java.util.*;

public class LeaderArrayOptimized {
    public static void main(String[] args) {
        int[] arr = {9, 8, 10, 4, 2, 1, 3, 5, 1};
        int n = arr.length;

        List<Integer> leaders = new ArrayList<>();
        int max = arr[n - 1];
        leaders.add(max); // rightmost element is always a leader

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= max) {
                leaders.add(arr[i]);
                max = arr[i];
            }
        }

        // Since we traversed from right to left, leaders are in reverse order
        Collections.reverse(leaders);

        System.out.println("Leaders: " + leaders);
    }
}
