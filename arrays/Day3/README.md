# 📘 Day 3 – Arrays Problems

This section contains problems on **maximum consecutive elements** and **leaders in array**.  
All solutions are implemented in **Java**, following interview-friendly approaches.

---

## ✅ Problems Solved

| Problem | File Name | Pattern | Variation / Notes | Approach | TC / SC |
|---------|-----------|---------|-------------------|----------|---------|
| Maximum Consecutive Elements ≥ k | `MaxConsecutiveGEK.java` | Linear Scan | Generalized version | Count consecutive `arr[i] ≥ k`, reset otherwise | O(n) / O(1) |
| Maximum Consecutive Ones | `MaxConsecutiveOnes.java` | Linear Scan | Special case of GEK with k = 1 | Count consecutive `1`s, reset if `0` | O(n) / O(1) |
| Maximum Consecutive Zeros | `MaxConsecutiveZeros.java` | Linear Scan | Variation of GEK with k = 0 | Count consecutive `0`s, reset if `1` | O(n) / O(1) |
| Leaders in Array | `LeaderArray.java` | Nested Scan | Print elements greater than all elements to their right | For each element, check all right-side elements | O(n²) / O(1) |
| Leaders in Array (Optimized) | `LeaderArrayOptimized.java` | Reverse Scan + Tracking Max | Optimized approach | Traverse from right, maintain running max | O(n) / O(1) |



