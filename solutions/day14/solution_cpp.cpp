class Solution {
public:
    long long maxKelements(vector<int>& nums, int k) {
        long long int ans = 0;
        priority_queue<int> pq;
        for (auto& i : nums) {
            pq.push(i);
        }

        while (k--) {
            int maxElement = pq.top();
            ans += maxElement;
            pq.pop();
            pq.push(ceil(maxElement / 3.0));
        }
        return ans;
    }
};