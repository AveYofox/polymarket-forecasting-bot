class Solution {
public:
    bool canArrange(vector<int>& arr, int k) {
        int n = arr.size();
        
        vector<int>result(k,0);

        for(int i=0 ; i<n; i++){
            int rem = ((arr[i] % k) + k) % k;

            result[rem]++;
        }

        if(result[0] % 2 != 0)      return false;

        for(int i = 1; i<= k/2 ; i++){
            if(result[i] != result[k-i]){
                return false;
            }
        }

        return true;;
    }
};