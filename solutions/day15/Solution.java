class Solution {

    public long minimumSteps(String s) {
        //keep track of where the last '0' while itrating array
        int zeroPos = 0;
        // total number of swaps
        long swap = 0;
        char[] ch = s.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '0') {
                // the number of swaps needed to bring this '0' to its correct position
                //it basically keep track of total 0's in array till current(i) position and then get count of 1's
                swap += i - zeroPos;
                
                // Increment zeroPos for keep track of zeros till current position for swap count
                zeroPos++;
            }
        }
        return swap;
    }
}


//Time Complexity :: O(n)
// Space Complexity :: O(n)
