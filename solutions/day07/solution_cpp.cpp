class Solution {
public:
    int minLength(string s) {
        stack<char> st;
        for(int i = 0 ; i < s.length() ; i++){
            if(st.empty()){
                st.push(s[i]);
            }
            else if(s[i] == 'B' and st.top() == 'A'){
                st.pop();
            }
            else if(s[i] == 'D' and st.top() == 'C'){
                st.pop();
            }
            else{
                st.push(s[i]);
            }
        }
        return st.size();
    }
};

// TC : O(N) Sc : O(N)