# 2530. Maximal Score After Applying K Operations

This repository contains a solution to the **2530. Maximal Score After Applying K Operations** problem. The goal of the problem is to find the maximum sum we can obtain by repeatedly selecting the largest element from a list and modifying it by pushing back one-third of its value.

## Problem Overview

Given a list of integers `nums` and an integer `k`, the task is to maximize the sum by performing `k` operations. Each operation consists of the following steps:

1. Select the largest element from the list.
2. Add the selected element to the total sum.
3. Replace the selected element with one-third of its value (rounded up to the nearest integer).
4. Repeat the process `k` times.

### Example
Suppose we have the list `nums = [10, 20, 7]` and `k = 3`. The algorithm will perform the following operations:

1. Select 20 (largest element), add it to the total sum, and replace it with `ceil(20/3) = 7`.
2. Select 10 (largest element), add it to the total sum, and replace it with `ceil(10/3) = 4`.
3. Select 7 (largest element), add it to the total sum, and replace it with `ceil(7/3) = 3`.

Thus, the maximum sum we can obtain after 3 operations is `20 + 10 + 7 = 37`.

## Approach

This solution uses a **max-heap** (priority queue) to efficiently extract the largest element from the list and perform the operations. Here is a step-by-step breakdown of the approach:

1. **Initialize a Max-Heap:** Push all elements of the input list `nums` into a max-heap (priority queue). A max-heap allows us to always extract the largest element in `O(log n)` time.
2. **Perform K Operations:**
   - Extract the largest element from the heap.
   - Add it to the total sum.
   - Replace the extracted element with one-third of its value (rounded up).
3. **Repeat:** Continue the above steps for `k` iterations.

### Time Complexity

- Inserting `n` elements into the priority queue takes `O(n log n)`.
- Each of the `k` operations involves extracting the maximum element and inserting a new value, both of which take `O(log n)` time.

Thus, the overall time complexity is `O(n log n + k log n)`.

## Code Explanation

```cpp
class Solution {
public:
    long long maxKelements(vector<int>& nums, int k) {
        long long int ans = 0;
        priority_queue<int> pq;
        for (auto& i : nums) {
            pq.push(i);
        }

        while (k--) {
            int maxElement = pq.top();
            ans += maxElement;
            pq.pop();
            pq.push(ceil(maxElement / 3.0));
        }
        return ans;
    }
};
```

### Explanation of the Code:
- **Input:** A vector of integers `nums` and an integer `k`.
- **Priority Queue:** A max-heap (`priority_queue<int>`) is used to store elements in descending order.
- **Main Loop:** For each iteration (k times):
  - Extract the largest element from the heap (`pq.top()`).
  - Add it to the result (`ans`).
  - Replace the extracted element with its one-third value (rounded up) and push it back into the heap (`pq.push(ceil(maxElement / 3.0))`).
- **Return Value:** The final result (`ans`) is returned after performing the `k` operations.

## Usage

To use this solution, clone the repository and compile the solution with your favorite C++ compiler. You can pass different `nums` arrays and values of `k` to test the functionality.

---
