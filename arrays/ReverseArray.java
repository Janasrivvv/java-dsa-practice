// Reverse an Array in Java
// Problems solved: Brute force (extra array) + Optimized (in-place swap)

// Brute Force Approach
// Time Complexity: O(n)
// Space Complexity: O(n)
public class ReverseArray {
    public static void bruteForceReverse(int[] arr) {
        int[] rev = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            rev[i] = arr[arr.length - 1 - i];
        }
        System.out.print("Brute Force Result: ");
        for (int num : rev) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Optimized Approach: In-place two pointers
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static void optimizedReverse(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.print("Optimized Result: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Test cases
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        bruteForceReverse(arr1);

        int[] arr2 = {10};
        optimizedReverse(arr2);

        int[] arr3 = {7, 7, 7, 7};
        optimizedReverse(arr3);

        int[] arr4 = {-1, -2, -3, -4};
        optimizedReverse(arr4);
    }
}
