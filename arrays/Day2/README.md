# Day 2 – Arrays Problems

| Problem | File Name | Pattern | Variation / Notes | Approach | TC / SC |
|---------|-----------|---------|-------------------|----------|---------|
| Check if Array is Sorted (Non-Decreasing) | `CheckSorted.java` | Linear Scan | Basic check for sorted order | Compare adjacent elements | O(n) / O(1) |
| Check if Array is Strictly Increasing | `CheckStrictlyIncreasing.java` | Linear Scan | Each element < next element | Compare arr[i] < arr[i+1] | O(n) / O(1) |
| Check if Array is Non-Decreasing | `CheckNonDecreasing.java` | Linear Scan | Allow duplicates | Compare arr[i] <= arr[i+1] | O(n) / O(1) |
| Check if Array is Sorted & Rotated (Ascending) | `CheckSortedAndRotatedAscending.java` | Rotation + Linear Scan | Sorted but rotated once | Count breakpoints + boundary check | O(n) / O(1) |
| Check if Array is Sorted & Rotated (Descending) | `CheckSortedAndRotatedDescending.java` | Rotation + Linear Scan | Descending sorted but rotated once | Count breakpoints + boundary check | O(n) / O(1) |
