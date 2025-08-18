/*
Problem Statement:
-----------------
Check if a given array is sorted in decreasing order.
An array is sorted if for every index i (0 ≤ i < n-1), arr[i] >= arr[i+1].

Examples:
Input: [5, 4, 3, 2, 1]
Output: Array is Sorted

Input: [5, 3, 2, 7]
Output: Array is Unsorted

Approach:
---------
- Traverse the array once.
- Compare each element with its next neighbor.
- If any arr[i] < arr[i+1], array is not sorted. (includes duplicates)
- Otherwise, after the loop, the array is sorted.

Time Complexity:
----------------
O(n) → Only one pass through the array.

Space Complexity:
-----------------
O(1) → Constant extra space.
*/

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        boolean isSorted = true;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                isSorted = false;
                break;
            }
        }

        if (isSorted) {
            System.out.println("Array is Sorted");
        } else {
            System.out.println("Array is Unsorted");
        }
    }
}
