class Solution {
public:
    int minSwaps(string s) {
        int size = 0; // Counter for unmatched opening brackets
        int n = s.size(); // Get the length of the string
        
        // Iterate through each character in the string
        for (int i = 0; i < n; i++) {
            char ch = s[i];
            if (ch == '[') {
                size++; // Increase counter for an opening bracket
            } else if (size > 0) {
                size--; // Match with an unmatched opening bracket
            }
            // If size is 0 or negative, it means we have more closing brackets
            // than opening brackets so far.
        }
        
        // Calculate the number of swaps needed to balance the string
        // (size + 1) / 2 gives us the minimum swaps needed
        return (size + 1) / 2; 
    }
};
