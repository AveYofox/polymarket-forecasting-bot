class Solution {
public:
    int maximumSwap(int num) {
       vector <int> nums;
       while(num){
        nums.push_back(num%10);
        num/=10;
       } 
    
    int max_idx ;
    reverse(nums.begin(),nums.end());
    int size = nums.size();
    for(int i=0;i<size;i++){
        max_idx=i;
        for(int j=i;j<size;j++){
            
            if(nums[j]>=nums[max_idx]){
               
                max_idx = j;
            }
        }
        if(max_idx!=i && nums[max_idx]!=nums[i]){
           
            swap(nums[i],nums[max_idx]);
            break;
        }

    }
    num = 0; 
       for(int i = 0; i < size; i++) {
           num = num * 10 + nums[i];
       }
    return num;
    }
};