| Problem | Pattern | Variation / Notes | Approach | TC / SC |
|---------|---------|-----------------|---------|---------|
| Find maximum/minimum 1st 2nd 3rd element in array | Linear Scan | Basic traversal | Traverse array, keep track of max | O(n) / O(1) |
| Reverse an array | In-place Operations / Linear Scan | Brute: use extra array; Optimized: swap elements in-place | Brute: Create new array, copy elements from end → start. Optimized: Use two pointers, swap start & end until middle | Brute: O(n) / O(n), Optimized: O(n) / O(1) |
