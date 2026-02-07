package solutions.day09;

public class solution_java{
    public int minAddToMakeValid(String s) {
        int openings = 0;   //counts the opening parenthesis in the string.
        int closings = 0;   //counts the closing parenthesis.
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')     //checks if the the character at index is an opening parenthesis.
                openings++;     //if true, increment it by 1.
            else {              //else, it's a closing parenthesis.
                if (openings > 0)       //first check if there is any opening parenthesis in the string.
                    openings--;     //if found a good pair, decrement openings.
                else
                    closings++;     //otherwise, increment the closings.
            }
        }
        return openings + closings;     //adding openings and closings - gets how many are not paired.
    }
}