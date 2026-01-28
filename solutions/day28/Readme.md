### Problem Statement: Two Sum II - Input Array Is Sorted

Given a **1-indexed** array of integers `numbers` that is already sorted in **non-decreasing order**, find two numbers such that they add up to a specific target number.

Let these two numbers be `numbers[index1]` and `numbers[index2]`, where:

- `1 <= index1 < index2 <= numbers.length`

Return the indices of the two numbers, `index1` and `index2`, added by one as an integer array `[index1, index2]` of length 2.

### Constraints:
- The tests are generated such that there is exactly **one solution**.
- You may **not use** the same element twice.
- Your solution must use only **constant extra space**.

### Explanation of the Approach:

This code solves the **Two Sum II - Input Array Is Sorted** problem using the **two-pointer technique**, which is efficient and operates in O(n) time complexity. Here's a step-by-step breakdown of how it works:

### Problem Recap:
You are given a sorted array `numbers` and a `target` value. The goal is to find two distinct numbers in the array such that their sum equals the `target`, and return their 1-based indices.

### Steps in the Code:

1. **Initialize Two Pointers**:
   - `left` starts at index `0` (the beginning of the array).
   - `right` starts at `numbers.length - 1` (the end of the array).
   These two pointers will be used to traverse the array from both ends.

2. **Iterate While Left <= Right**:
   The loop continues until the two pointers meet or cross. Within each iteration:
   
   - **Calculate Total**:  
     The `total` is the sum of the elements at the current `left` and `right` pointers:
     ```java
     int total = numbers[left] + numbers[right];
     ```
   
   - **Check if the Total Equals the Target**:
     If the `total` equals the `target`:
     ```java
     if(total == target) break;
     ```
     The solution is found, so the loop breaks. Otherwise, adjust the pointers to bring the sum closer to the target.

3. **Adjust the Pointers**:
   - If the `total` is less than the `target`:
     ```java
     if(total < target) left++;
     ```
     This means that the sum is too small, so you need to increase the sum. Move the `left` pointer to the right (toward larger values).
   
   - If the `total` is greater than the `target`:
     ```java
     else right--;
     ```
     This means the sum is too large, so you need to decrease the sum. Move the `right` pointer to the left (toward smaller values).

4. **Return the Result**:
   Once the correct pair is found, return their indices:
   ```java
   return new int[] {left+1, right+1};
   ```
   The indices are adjusted by adding 1 because the problem specifies that the array is **1-indexed**.

### Why This Approach Works:

- **Sorted Array**: Since the array is sorted, using two pointers is an optimal solution. The sorted property allows us to eliminate many possibilities by adjusting one pointer at a time based on whether the sum is too large or too small.
  
- **Constant Space**: The algorithm uses only constant extra space (i.e., no extra arrays or complex data structures), as the only additional variables used are `left`, `right`, and `total`.

### Time Complexity:
- **O(n)**: The two pointers traverse the array once from both ends, so the time complexity is linear in the size of the input.

### Example:

**Input**:  
`numbers = [2, 7, 11, 15]`, `target = 9`

- Initial pointers: `left = 0`, `right = 3`
- First iteration: `total = numbers[0] + numbers[3] = 2 + 15 = 17` (too large, move `right` pointer left)
- Second iteration: `total = numbers[0] + numbers[2] = 2 + 11 = 13` (still too large, move `right` pointer left)
- Third iteration: `total = numbers[0] + numbers[1] = 2 + 7 = 9` (equal to target, break the loop)
  
Return: `[1, 2]` (1-based indices).