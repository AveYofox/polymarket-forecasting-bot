class Solution {
public:
    bool areSentencesSimilar(string sentence1, string sentence2) {
        vector<string> v1,v2;
        stringstream ss1(sentence1);
        stringstream ss2(sentence2);
        string s;
        while (ss1>>s) {
            v1.push_back(s);
        }
        while (ss2>>s) {
            v2.push_back(s);
        }
        
        if(v2.size() > v1.size()) swap(v1,v2);
        int l = 0 ,  r = 0 , n1 = v1.size() , n2 = v2.size();
        while(l < v2.size() and v1[l] == v2[l]) l++;
        while(r < v2.size() and v1[n1-1-r] == v2[n2-1-r]) r++;

        return l+r >= n2;
        }


};

// solution approach in readme.md