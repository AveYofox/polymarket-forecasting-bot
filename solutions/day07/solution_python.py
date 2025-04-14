class Solution:
    def minLength(self, s: str) -> int:
        stack = []          # Initialize an empty stack to keep track of characters

        # Iterate over each character in the string 's'
        for c in s:
            if not stack:           # If empty, add the character
                stack.append(c)
                continue

            # If current char is 'B' and the top is 'A',
            # forms "AB",remove 'A' to simulate removal of "AB"
            if c == "B" and stack[-1] == "A":
                stack.pop()

            # If current char is 'D' and the top is 'C',
            # forms "CD",remove 'C' to simulate removal of "D"
            elif c == "D" and stack[-1] == "C":
                stack.pop()
                
            else:                   # neither "AB" nor "CD" ,add the char to the stack
                stack.append(c)

        return len(stack)