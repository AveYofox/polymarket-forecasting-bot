class Solution {
public:
    int minSubarray(vector<int>& nums, int p) {
        long long sum = 0;
        for (int i : nums) {
            sum += i;
        }
        
        int rem = sum % p; 
        if (rem == 0) return 0;
        
        unordered_map<int, int> prefixModMap; 
        prefixModMap[0] = -1; 
        long long prefixSum = 0;
        int minLength = nums.size(); 
        
        for (int i = 0; i < nums.size(); i++) {
            prefixSum += nums[i];
            int currentMod = prefixSum % p;
            int targetMod = (currentMod - rem + p) % p; // Find the mod that would remove the remainder
            
            if (prefixModMap.find(targetMod) != prefixModMap.end()) {
                minLength = min(minLength, i - prefixModMap[targetMod]);
            }
            
            prefixModMap[currentMod] = i;
        }
        
        return (minLength == nums.size()) ? -1 : minLength;
    }
};
