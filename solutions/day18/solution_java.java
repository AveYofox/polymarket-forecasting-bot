package solutions.day18;

class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int maxOr = 0;
        for(int x : nums){
            maxOr |= x;
        }

        int currOr = 0;

        return count(0,nums,currOr,maxOr);
    }

    public int count(int idx, int[] nums, int currOr, int maxOr){

        if(idx==nums.length){
            if(currOr==maxOr){
                return 1;
            }
            return 0;
        }


        int take = count(idx+1, nums, currOr | nums[idx], maxOr);

        int notTake = count(idx+1, nums, currOr, maxOr);

        return take + notTake;
    }
}
