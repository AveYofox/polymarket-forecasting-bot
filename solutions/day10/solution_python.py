class Solution:
    def maxWidthRamp(self, nums: List[int]) -> int:
        n = len(nums)
        stack = []
        
        # Step 1: Build a decreasing stack of indices
        for i in range(n):
            if not stack or nums[stack[-1]] > nums[i]:
                stack.append(i)
        
        maxWidth = 0
        
        # Step 2: Traverse from the end and find maximum width ramp
        for j in range(n - 1, -1, -1):
            while stack and nums[stack[-1]] <= nums[j]:
                maxWidth = max(maxWidth, j - stack.pop())
        
        return maxWidth


# Explanation of the Code:
# Initialization:

# n stores the length of the input list nums.
# stack is initialized as an empty list to hold indices.
# Building the Decreasing Stack:

# The first loop iterates through the list. If the stack is empty or the current number is less than the number at the index stored at the top of the stack, the current index is pushed onto the stack. This ensures that the stack contains indices of elements in a decreasing order.
# Finding the Maximum Width Ramp:

# The second loop iterates backward through the list. For each index j, it checks if the current number is greater than or equal to the number at the index stored at the top of the stack. If so, it calculates the width of the ramp and updates maxWidth if the current width is greater than the previously recorded maximum. The index is then popped from the stack.
# Return Statement: Finally, the method returns the maximum width found.
