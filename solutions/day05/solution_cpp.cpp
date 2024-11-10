#include <string>
#include <vector>

class Solution {
public:
    bool checkInclusion(std::string s1, std::string s2) {
        if (s1.length() > s2.length()) return false; // Early exit if s1 is longer than s2

        std::vector<int> a(26, 0); // Frequency array for s1
        for (char ch : s1) {
            a[ch - 'a']++;
        }

        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            std::vector<int> b(26, 0); // Frequency array for the current substring of s2
            for (int j = 0; j < s1.length(); j++) {
                b[s2[i + j] - 'a']++;
            }
            if (check(a, b)) {
                return true; // Found a permutation
            }
        }
        return false; // No permutation found
    }

    bool check(const std::vector<int>& a, const std::vector<int>& b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) {
                return false; // Frequencies do not match
            }
        }
        return true; // Frequencies match
    }
};
