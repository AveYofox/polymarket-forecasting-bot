class Solution:
    def minSwaps(self, s: str) -> int:
        stack = []
        ans = 0
        
        for char in s:
            if char == '[':
                stack.append(char)
            else:  # char == ']'
                if stack:
                    stack.pop()
                else:
                    ans += 1

        return (ans + 1) // 2
