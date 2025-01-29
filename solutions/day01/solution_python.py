class Solution(object):
    def checkArithmeticSubarrays(self, nums, l, r):
        """
        :type nums: List[int]
        :type l: List[int]
        :type r: List[int]
        :rtype: List[bool]
        """
        def is_arith(n):
            if len(n) <= 1:
                return True
            n.sort()  
            d = n[1] - n[0]
            for i in range(2, len(n)):
                if n[i] - n[i-1] != d:
                    return False
            return True
    
        result = []
        for left, right in zip(l, r):
            result.append(is_arith(nums[left:right+1]))
        return result
