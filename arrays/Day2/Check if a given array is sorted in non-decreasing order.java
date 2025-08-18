/*
Problem Statement:
-----------------
Check if a given array is sorted in non-decreasing order.
If every element arr[i] is <= arr[j] for all j > i, then the array is sorted.
Otherwise, it is unsorted.

Example:
Input: [1, 2, 3, 4, 5]
Output: Array is Sorted

Input: [1, 2, 3, 4, 5, 1]
Output: Array is Unsorted

Brute Force Approach:
---------
- Use two nested loops to compare each element with all later elements.
- If any arr[i] > arr[j], then the array is not sorted.
- Break early when unsorted condition is found to save time.

Time Complexity:
----------------
O(n^2) in the worst case (because of nested loops).
But breaks early when an unsorted pair is found.

Space Complexity:
-----------------
O(1) → Only a boolean variable is used.
*/

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 1};
        int n = arr.length;
        boolean isSorted = true;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    isSorted = false;
                    break; // break inner loop
                }
            }
            if (!isSorted) break; // break outer loop
        }

        if (isSorted) {
            System.out.println("Array is Sorted");
        } else {
            System.out.println("Array is Unsorted");
        }
    }
}

/*
Optimized Approach:
---------
- Traverse the array once.
- Compare each element with its next neighbor.
- If any arr[i] > arr[i+1], array is not sorted.
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
            if (arr[i] > arr[i + 1]) {
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
