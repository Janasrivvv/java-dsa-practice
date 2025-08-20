/*
Problem: Leaders in an Array
Definition: An element is a leader if it is strictly greater than all the elements to its right.
Example: [16, 17, 4, 3, 5, 2] → Leaders = [17, 5, 2]
Approach: For each element, check all elements to the right.
Time Complexity: O(n^2)
Space Complexity: O(1)
BRUTE FORCE APPROACH
*/

public class LeadersInArray {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        int n = arr.length;

        System.out.print("Leaders in the array: ");
        for (int i = 0; i < n; i++) {
            boolean isLeader = true;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    isLeader = false;
                    break;
                }
            }
            if (isLeader) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
