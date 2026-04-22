class Solution {
public:
    int maxWidthRamp(vector<int>& nums) 
    {
        stack<int> s;
        for(int i=0;i<nums.size();i++)
        {
            if(i==0)
            s.push(i);
            else if(nums[s.top()]>nums[i])
            s.push(i);
        }
        int ma = 0;
        for(int i=nums.size()-1;i>0;i--)
        {
            while(!s.empty() && nums[s.top()]<=nums[i])
            {
                    ma = max(ma,i-s.top());
                    s.pop();
            }
        }
        return ma;
    }
};
