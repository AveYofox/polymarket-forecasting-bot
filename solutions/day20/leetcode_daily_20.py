class Solution:
    def parseBoolExpr(self, expression: str) -> bool:
        stack = []

        for char in expression:
            if char == 't' or char == 'f':
                stack.append(char == 't')
            elif char == '!' or char == '&' or char == '|':
                stack.append(char)
            elif char == '(':
                stack.append(char)
            elif char == ')':
                # Evaluate the expression inside the parentheses
                temp = []
                while stack and stack[-1] != '(':
                    temp.append(stack.pop())
                # Pop the '('
                stack.pop()
                # Get the operator
                operator = stack.pop()
                if operator == '!':
                    stack.append(not temp[0])
                elif operator == '&':
                    result = True
                    for val in temp:
                        result = result and val
                    stack.append(result)
                elif operator == '|':
                    result = False
                    for val in temp:
                        result = result or val
                    stack.append(result)

        return stack[0]