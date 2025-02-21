class Solution:
    def arrayRankTransform(self, arr: List[int]) -> List[int]:
        s = set(arr)  
        mp = {}
        r = 1
        
        for value in sorted(s):
            mp[value] = r
            r += 1
        
        for i in range(len(arr)):
            arr[i] = mp[arr[i]]
        
        return arr