# Find Kth Bit in Nth Binary String

## Problem Statement
Given two positive integers n and k, the binary string Sn is formed as follows:

    S1 = "0"
    Si = Si - 1 + "1" + reverse(invert(Si - 1)) for i > 1

Where + denotes the concatenation operation, reverse(x) returns the reversed string x, and invert(x) inverts all the bits in x (0 changes to 1 and 1 changes to 0).

## Explanation
For example, the first four strings in the above sequence are:

    S1 = "0"
    S2 = "011"
    S3 = "0111001"
    S4 = "011100110110001"

Return the kth bit in Sn. It is guaranteed that k is valid for the given n.

## Example
Example 1:

Input: n = 3, k = 1
Output: "0"
Explanation: S3 is "0111001".
The 1st bit is "0".

Example 2:

Input: n = 4, k = 11
Output: "1"
Explanation: S4 is "011100110110001".
The 11th bit is "1".

### JAVA Approach Explanation

1. Base case: When n = 1, the binary string is "0"
2. Find the length of the current string Sn, which is 2^n - 1
3. Find the middle position
4. If k is the middle position, return '1'
5. If k is in the first half, find the bit in Sn-1
6. If k is in the second half, find the bit in Sn-1 and invert it

### Time Complexity ⏱️
- The overall **time complexity** is `O(n)` because we recursively reduce the problem size with each step by one level.

### Space Complexity 💾
- The space complexity is `O(n)` due to the recursion stack.