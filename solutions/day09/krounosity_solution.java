class Solution {
    public int minAddToMakeValid(String s) {

        // Brackets to be paired.
        int pair = 0;

        // Brackets which are not paired and we will have to add brackets for them.
        int cannotPair = 0;

        // Iterating through the string.
        for(int i=0;i<s.length();i++){

            // If an open bracket is encountered, we increase the number of brackets opened.
            if(s.charAt(i) == '(') pair++;
            else{
                // If a closing bracket is encountered, we reduce the number of paired brackets.
                pair--;

                // If the number of closing brackets exceed the opening ones:
                if(pair<0){
                    
                    // We will have to add brackets for them
                    cannotPair++;

                    // The above line will adjust the bracket pairs.
                    pair++;
                }
            }
        }

        // Returning closing_brackets_to_pair + opening_brackets_to_pair
        return cannotPair+pair;
    }
}
