# Intuition

This code provides an efficient approach to evaluating boolean expressions using a stack, focusing on significant elements like operators, boolean values, and parentheses, while ignoring irrelevant characters (like commas). The evaluation of expressions happens as soon as we encounter closing parentheses, allowing for early stopping when results become clear.

## Key Idea

We push operators and boolean values onto a stack as we traverse the expression. Upon encountering a closing parenthesis, we pop values off the stack to evaluate the subexpression. 

An improvement in this approach is that for certain operators (such as `&` and `|`), we can stop evaluating early:
- For the `&` operator: If we encounter a `f` (false), we can conclude the result is `f` without needing to check further.
- For the `|` operator: If we encounter a `t` (true), we can stop and conclude the result is `t`.

### Example:
For the expression `&(t,|(f,t))`, we:
1. Push `&` and `t`, then push `|` followed by `f` and `t`.
2. When popping for the `|` subexpression, we encounter a `t`, so we can conclude the result of the subexpression is `t` without evaluating further.
3. Push `t` back onto the stack, then evaluate the `&` operator, which results in `t` since all values are true.

## Approach

1. **Initialize a stack** to store operators and boolean values.
2. **Traverse the expression**, processing one character at a time:
   - If the character is a comma or an open parenthesis, **skip** it.
   - If the character is a boolean (`t` or `f`) or an operator (`&`, `|`, `!`), **push** it onto the stack.
   - If the character is a **closing parenthesis**:
     - Initialize two boolean flags (`hasTrue`, `hasFalse`) to track whether we've encountered `t` or `f` within the parentheses.
     - **Pop values** from the stack and check:
       - If the value is `t`, set `hasTrue` to `true`.
       - If the value is `f`, set `hasFalse` to `true`.
     - **Pop the operator** from the stack.
     - **Evaluate** the subexpression based on the operator:
       - If `!`, push `f` if `hasTrue` is `true`, otherwise push `t`.
       - If `&`, push `f` if `hasFalse` is `true`, otherwise push `t`.
       - If `|`, push `t` if `hasTrue` is `true`, otherwise push `f`.
3. **Final result** will be the top value in the stack.

## Complexity

- **Time Complexity**: O(N), where N is the number of characters in the expression. We traverse the entire expression once and evaluate subexpressions in constant time.
- **Space Complexity**: O(N), as we use a stack to store the operators and boolean values.
