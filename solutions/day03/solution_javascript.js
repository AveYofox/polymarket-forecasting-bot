/**
 * @param {number[]} nums
 * @param {number} p
 * @return {number}
 */
var minSubarray = function(nums, p) {
    let n = nums.length;
    let target = nums.reduce((a, b) => a + b, 0) % p;
    
    if (target === 0) return 0;
    
    let answer = n;
    let prefix_sum = 0;
    let hashmap = {0: -1};
    
    for (let i = 0; i < n; i++) {
        prefix_sum += nums[i];
        let key = (prefix_sum % p - target + p) % p;
        
        if (key in hashmap) {
            answer = Math.min(answer, i - hashmap[key]);
        }
        
        hashmap[prefix_sum % p] = i;
    }
    
    return answer < n ? answer : -1;
};
