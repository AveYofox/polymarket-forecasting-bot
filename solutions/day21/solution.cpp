#include <iostream>
#include <unordered_set>
#include <string>
using namespace std;

class Solution {
public:
    // Function to find the maximum number of unique splits for the given string
    int maxUniqueSplit(string s) {
        maxUniqueSplits = 0; // Initialize the maximum unique splits to 0
        unordered_set<string> currentSet; // Set to keep track of unique substrings
        backtrack(s, 0, currentSet); // Start the backtracking process
        return maxUniqueSplits; // Return the maximum number of unique splits found
    }

private:
    int maxUniqueSplits; // Variable to store the maximum number of unique splits

    // Backtracking function to explore all possible unique splits
    void backtrack(const string& s, int start, unordered_set<string>& currentSet) {
        // If we have reached the end of the string, update the maximum splits
        if (start == s.length()) {
            maxUniqueSplits = max(maxUniqueSplits, (int)currentSet.size());
            return;
        }

        // Try all possible substrings starting from the current position
        for (int end = start + 1; end <= s.length(); ++end) {
            string substring = s.substr(start, end - start); // Extract the substring

            // Check if the substring is not already in the set (to ensure uniqueness)
            if (currentSet.find(substring) == currentSet.end()) {
                currentSet.insert(substring); // Add the substring to the set
                backtrack(s, end, currentSet); // Recur to find further splits
                currentSet.erase(substring); // Backtrack: remove the substring from the set
            }
        }
    }
};