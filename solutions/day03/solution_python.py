class Solution:
    def minSubarray(self, nums: List[int], p: int) -> int:
        total_sum = sum(nums)
        remainder = total_sum % p
        if remainder == 0:
            return 0
        
        prefix_mod = {0: -1}  # A dictionary to store prefix sums modulo p
        pref_sum = 0
        min_length = len(nums)
        
        for i in range(len(nums)):
            pref_sum += nums[i]
            curr = pref_sum % p
            target_mod = (curr - remainder + p) % p
            
            if target_mod in prefix_mod:
                min_length = min(min_length, i - prefix_mod[target_mod])
            
            prefix_mod[curr] = i
        
        return -1 if min_length == len(nums) else min_length