class Solution {
public:
    long long dividePlayers(vector<int>& skill) {
        sort(skill.begin(),skill.end());
        int n=skill.size();
        set<long long >s;
        
        long long pro=0;
        for(int i=0;i<n/2;i++){
            s.insert(skill[i]+skill[n-1-i]);
            pro+=(skill[i]*1ll*skill[n-1-i]);
        }
        if(s.size()==1)
        return pro;

        return -1;

        
    }
};
