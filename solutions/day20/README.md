# 1106. Parsing A Boolean Expression

## Problem Statement

You're given a string that represents a boolean expression. You need to evaluate this expression and return the result. The expression can be in one of the following forms:

- `'t'` which evaluates to `true`.
- `'f'` which evaluates to `false`.
- `'!(subExpr)'` which evaluates to the logical NOT of the inner expression `subExpr`.
- `'&(subExpr1, subExpr2, ..., subExprn)'` which evaluates to the logical AND of the inner expressions `subExpr1, subExpr2, ..., subExprn` where `n >= 1`.
- `'|(subExpr1, subExpr2, ..., subExprn)'` which evaluates to the logical OR of the inner expressions `subExpr1, subExpr2, ..., subExprn` where `n >= 1`.

The expression is guaranteed to be valid and follow the given rules.

### Examples

1. **Input**: `"&(|(f))"`
   **Output**: `false`
   **Explanation**:
   - First, evaluate `|(f)` --> `f`. The expression is now `"&(f)"`.
   - Then, evaluate `&(f)` --> `f`. The expression is now `"f"`.
   - Finally, return `false`.

2. **Input**: `"|(f,f,f,t)"`
   **Output**: `true`
   **Explanation**: The evaluation of `(false OR false OR false OR true)` is `true`.

3. **Input**: `"!(&(f,t))"`
   **Output**: `true`
   **Explanation**:
   - First, evaluate `&(f,t)` --> `(false AND true)` --> `false` --> `f`. The expression is now `"!(f)"`.
   - Then, evaluate `!(f)` --> `NOT false` --> `true`. We return `true`.

## Solution Approach

### Brute-Force Approach

A brute-force approach involves recursively parsing the expression and evaluating each sub-expression. This can be inefficient due to the overhead of recursive calls and the complexity of managing nested expressions.

### Optimized Approach

The optimized approach uses a stack to efficiently parse and evaluate the boolean expression. Here's how it works:

1. **Initialize a Stack**: Use a stack to keep track of the current expression and its components.
2. **Iterate through the Expression**: As you go through each character in the expression, handle different types of characters (`(`, `)`, `&`, `|`, `!`, `t`, `f`, `,`).
3. **Handle Different Operators**:
   - For `t` and `f`, push them onto the stack.
   - For `!`, `&`, and `|`, push them onto the stack.
   - For `(`, push it onto the stack to mark the beginning of a new sub-expression.
   - For `)`, evaluate the sub-expression up to the last `(` and replace it with the result.
4. **Evaluate Sub-expressions**:
   - For `!`, pop the top element (which should be a boolean value) and push the negation of that value.
   - For `&`, pop all elements up to the last `(` and evaluate the logical AND of these elements.
   - For `|`, pop all elements up to the last `(` and evaluate the logical OR of these elements.

### Explanation

**Stack Operations**: The stack is used to keep track of the current state of the expression. When you encounter a `(`, you push it onto the stack to mark the beginning of a new sub-expression. When you encounter a `)`, you evaluate the sub-expression up to the last `(` and replace it with the result.

**Boolean Evaluation**: For `!`, you simply negate the top value on the stack. For `&` and `|`, you pop all values up to the last `(` and evaluate them accordingly.

### Time Complexity

The time complexity of this approach is O(n), where n is the length of the expression. This is because we process each character in the expression exactly once.
