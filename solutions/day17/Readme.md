# Maximum Swap 🔄

## Problem Statement

You are given an integer num. You can swap two digits at most once to get the maximum valued number.
Return the maximum valued number you can get.

## Function Description
**Function Name**: `maximumSwap`

- **Input**: A non-negative integer `num`.
- **Output**: The largest possible number after at most one swap of two digits.

## Explanation

### 1. **Convert the Number into Digits**:  
   - Extract the individual digits of the number by repeatedly taking the modulo (`% 10`) of the number and store them in a vector.
   - Since digits are extracted from least significant to most significant, reverse the vector to restore the original digit order.

### 2. **Find the Optimal Swap**:  
   - Traverse the digits from left to right. For each digit, search for the largest digit that appears after it (and is larger than the current digit).
   - If such a larger digit is found, swap it with the current digit and break the loop, as only one swap is allowed.

### 3. **Reconstruct the Number**:  
   - After performing the swap, reconstruct the number by combining the digits in the correct order.

### Time Complexity ⏱️
- The number of digits in `num` is `O(log10(num))`.
- Extracting and reversing the digits takes `O(log10(num))`.
- The nested loop to find the optimal swap takes `O((log10(num))^2)` since for each digit, you compare it with all subsequent digits.

Thus, the overall **time complexity** is `O((log10(num))^2)`.

### Space Complexity 💾
- The space complexity is `O(log10(num))` due to the storage of digits in the vector.