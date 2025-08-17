// Find First, Second, and Third Maximum (and Minimum) in an Array
// Includes Brute Force (Sorting) and Optimized (Single Pass)

// Brute Force Approach
// Sort the array and pick elements from end (for max) or start (for min)
// Time Complexity: O(n log n)
// Space Complexity: O(1) if sorting in-place
import java.util.Arrays;

public class MaxMin {

    // Brute force using sorting
    public static void bruteForceMaxMin(int[] arr) {
        Arrays.sort(arr);

        System.out.println("Brute Force (Sorted Array): " + Arrays.toString(arr));

        int n = arr.length;
        if (n >= 3) {
            System.out.println("Max: " + arr[n - 1]);
            System.out.println("Second Max: " + arr[n - 2]);
            System.out.println("Third Max: " + arr[n - 3]);

            System.out.println("Min: " + arr[0]);
            System.out.println("Second Min: " + arr[1]);
            System.out.println("Third Min: " + arr[2]);
        } else {
            System.out.println("Array too small for 2nd/3rd max or min.");
        }
    }

    // Optimized Approach (Single Pass)
    // Keep track of first, second, third max (or min) while traversing
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static void optimizedMaxMin(int[] arr) {
        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE, thirdMax = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE, thirdMin = Integer.MAX_VALUE;

        for (int num : arr) {
            // For maximums
            if (num > max) {
                thirdMax = secondMax;
                secondMax = max;
                max = num;
            } else if (num > secondMax && num < max) {
                thirdMax = secondMax;
                secondMax = num;
            } else if (num > thirdMax && num < secondMax) {
                thirdMax = num;
            }

            // For minimums
            if (num < min) {
                thirdMin = secondMin;
                secondMin = min;
                min = num;
            } else if (num < secondMin && num > min) {
                thirdMin = secondMin;
                secondMin = num;
            } else if (num < thirdMin && num > secondMin) {
                thirdMin = num;
            }
        }

        System.out.println("Optimized Results:");
        System.out.println("Max: " + (max == Integer.MIN_VALUE ? "Not found" : max));
        System.out.println("Second Max: " + (secondMax == Integer.MIN_VALUE ? "Not found" : secondMax));
        System.out.println("Third Max: " + (thirdMax == Integer.MIN_VALUE ? "Not found" : thirdMax));

        System.out.println("Min: " + (min == Integer.MAX_VALUE ? "Not found" : min));
        System.out.println("Second Min: " + (secondMin == Integer.MAX_VALUE ? "Not found" : secondMin));
        System.out.println("Third Min: " + (thirdMin == Integer.MAX_VALUE ? "Not found" : thirdMin));
    }

    // Test Cases
    public static void main(String[] args) {
        int[] arr1 = {5, 1, 9, 2, 10, 10};   // normal array
        int[] arr2 = {1};                    // single element
        int[] arr3 = {-5, -2, -9, -1};       // all negatives
        int[] arr4 = {3, 3, 3, 3};           // all same

        System.out.println("\n== Brute Force ==");
        bruteForceMaxMin(arr1);

        System.out.println("\n== Optimized ==");
        optimizedMaxMin(arr1);

        System.out.println("\n== Edge Cases ==");
        optimizedMaxMin(arr2);
        optimizedMaxMin(arr3);
        optimizedMaxMin(arr4);
    }
}
