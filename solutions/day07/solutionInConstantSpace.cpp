class Solution {
public:
    int minLength(string s) {
        int writeIdx = 0; // Acts like the stack pointer
        for (char currentChar : s) {
            if (writeIdx > 0 && 
                ((s[writeIdx - 1] == 'A' && currentChar == 'B') || 
                 (s[writeIdx - 1] == 'C' && currentChar == 'D'))) {
                writeIdx--; // Remove the last character (pop)
            } else {
                s[writeIdx++] = currentChar; // Add the current character (push)
            }
        }
        return writeIdx; // Size of the remaining valid string
    }
};
