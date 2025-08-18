/*
Problem: Check if the given array is 
1) Strictly Descending
2) Descending and Rotated
3) Not Sorted (Unsorted)

Approach:
- For descending, we check arr[i] < arr[i+1] (a break in descending order).
- Count how many such breaks exist.
- Also check the wrap-around (last element < first element).
- Rules:
   count == 0 → Sorted in descending
   count == 1 → Sorted and Rotated (descending)
   count > 1 → Unsorted

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 6, 5, 4, 3, 2};
        int count = 0;
        int n = arr.length;

        // Count breaks in descending order
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                count++;
            }
        }

        // Wrap-around check (for descending arrays)
        if (arr[n - 1] < arr[0]) {
            count++;
        }

        if (count == 0) {
            System.out.println("Array is Sorted (Descending)");
        } else if (count == 1) {
            System.out.println("Array is Sorted and Rotated (Descending)");
        } else {
            System.out.println("Array is Unsorted");
        }
    }
}
