class Solution {
public:
    vector<int> arrayRankTransform(vector<int>& arr) {
        set<int>s;
        for(auto i:arr)
        s.insert(i);

        unordered_map<int,int>mp;
        int t=1;
        for(auto i:s){
            mp[i]=t;
            t++;
        }
        vector<int>ans;
        for(int i=0;i<arr.size();i++){
            ans.push_back(mp[arr[i]]);
        }
        return ans;
    }
};
