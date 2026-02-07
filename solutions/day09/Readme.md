# minAddToMakeValid Parentheses Problem 🧩

## Problem Statement

Given a string `s` consisting of `'('` and `')'` characters, the task is to determine the minimum number of parentheses that must be added to the string to make it valid.

A string is valid if:
- Open parentheses `'('` must be closed by the corresponding closing parentheses `')'`.
- Open parentheses must be closed in the correct order.

## Function Description

The function `minAddToMakeValid` processes the string and returns the number of unmatched opening and closing parentheses that need to be added to make the string valid.


## Explanation

1. **openings**: This variable counts the number of unmatched opening parentheses `'('`.
2. **closings**: This variable counts the number of unmatched closing parentheses `')'`.
3. The function iterates through the string `s`:
   - If an opening parenthesis `'('` is encountered, it increments the `openings` count.
   - If a closing parenthesis `')'` is encountered:
     - It first checks if there is an unmatched opening parenthesis. If there is, it decrements the `openings` count, effectively forming a valid pair.
     - If no unmatched opening exists, it increments the `closings` count to account for the unmatched closing parenthesis.
4. The result is the sum of unmatched `openings` and `closings`, representing the minimum number of parentheses that need to be added.

## Time Complexity ⏱️

- **O(n)** where `n` is the length of the string `s`.
  - The function iterates through the string exactly once, processing each character in constant time `O(1)`.

## Space Complexity 💾

- **O(1)** (constant space).
  - The function uses only a fixed amount of extra space: two integer variables (`openings` and `closings`).
  - No additional space is required that grows with the input size, making the space complexity constant.

## Example

**Input**: `s = "())"`

**Output**: `1`

- Explanation: The second `)` has no matching opening parenthesis. We need to add one `'('` to make the string valid.

**Input**: `s = "((("`

**Output**: `3`

- Explanation: All three opening parentheses are unmatched. We need to add three `)` to make the string valid.

## Conclusion

The function `minAddToMakeValid` efficiently computes the number of parentheses to add to make the string valid by keeping track of unmatched opening and closing parentheses as it scans the input string. It operates in linear time and uses constant space, making it optimal for large inputs.