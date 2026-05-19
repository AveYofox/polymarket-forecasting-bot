#include <bits/stdc++.h> // This includes most standard libraries
using namespace std;    // Use the standard namespace

class Solution {
public:
    int minGroups(vector<vector<int>>& intervals) {
        vector<pair<int, int>> vp;  // Create a vector to store starting and ending intervals separately.
        
        for (int i = 0; i < intervals.size(); i++) {
            vp.push_back({intervals[i][0], 1});     // Push the starting intervals into the vector vp.
            vp.push_back({intervals[i][1] + 1, -1});  // Push the ending intervals into the vector vp.
        }
        
        sort(vp.begin(), vp.end()); // Sort the vector vp.
        
        int maxi = 1;   // This is for the final answer
        int cnt = 0;    // This is for counting 
        
        for (auto it : vp) {
            int type = it.second;   // Iterate each point; if it is 1, add 1 to cnt, if -1, subtract 1 from cnt
            cnt += type;
            maxi = max(maxi, cnt);  // Store the max value of cnt
        }
        
        return maxi;        // Return maxi
    }
};
