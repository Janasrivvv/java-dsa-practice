/*
Problem: Check if the given array is Sorted or Sorted & Rotated or Unsorted.

Definition:
- A sorted array: strictly increasing or non-decreasing order.
- A sorted & rotated array: formed by taking a sorted array and rotating it some number of times.
  Example: [3,4,5,1,2] is sorted & rotated version of [1,2,3,4,5].

Approach:
1. Count the number of "drops" (places where arr[i] > arr[i+1]).
2. Also check the wrap-around case (last element > first element).
3. If:
   - count == 0 → Array is Sorted
   - count == 1 → Array is Sorted and Rotated
   - count > 1 → Array is Unsorted

Time Complexity: O(n)  
Space Complexity: O(1)
*/

public class Main {
    public static void main(String[] args) {
        int[] arr = {7, 1, 2, 3, 5, 6};
        int count = 0;
        int n = arr.length;

        // Count breaks in sorted order
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                count++;
            }
        }
        
        // Wrap-around check (last element compared to first)
        if (arr[n - 1] > arr[0]) {
            count++;
        }

        if (count == 0) {
            System.out.println("Array is Sorted");
        } else if (count == 1) {
            System.out.println("Array is Sorted and Rotated");
        } else {
            System.out.println("Array is Unsorted");
        }
    }
}
