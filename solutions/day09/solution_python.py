class Solution:
    def minAddToMakeValid(self, s: str) -> int:
        open_needed = 0
        close_needed = 0
        
        for char in s:
            if char == '(':
                # Unmatched opening parenthesis
                open_needed += 1
            elif char == ')':
                # If there's an unmatched opening parenthesis, match it
                if open_needed > 0:
                    open_needed -= 1
                else:
                    # Otherwise, we need an extra opening parenthesis
                    close_needed += 1
        
        # The total moves required
        return open_needed + close_needed
