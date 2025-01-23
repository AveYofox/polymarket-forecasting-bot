class Solution {
    public int minLength(String s) {

        // Faster than Stack<>
        Deque<Character> stack = new ArrayDeque<>();

        // For each character from left to right in input string.
        for (char ch : s.toCharArray()) {

            // Pushing the character in stack.
            stack.push(ch);

            // Whether the character has been removed in the current iteration or not. (Set
            // "removed" to "true" as default).
            boolean removed = true;

            // Iterating for whether "removed" or not AND stack has atleast 2 elements.
            while (stack.size() > 1 && removed) {

                // Fetching first character in stack.
                char top = stack.pop();

                // Checking second character and first character whether they are to be popped
                // or not.

                // If so, we remove the 2nd character too.
                if ((stack.peek() == 'A' && top == 'B') || (stack.peek() == 'C' && top == 'D'))
                    stack.pop();
                else {

                    // Else, we push the 1st element at the top again.
                    stack.push(top);

                    // Setting removed to false.
                    removed = false;
                }
            }
        }

        // Returning length of string, i.e., stack's size.
        return stack.size();
    }
}