class Solution {
public:
    int minAddToMakeValid(string s) {
        int c = 0 ,  b = 0;
        for(int i = 0 ;i < s.size() ; i++){
            if(s[i] == '('){
                c++;
            }
            else{
                if(c > 0) c--;
                else b++;
            }
        }
        return c+b;
    }
};
// TC : O(N) SC : O(1)