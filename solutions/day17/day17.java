// Easy approach for beginners
class Solution 
{
    public int maximumSwap(int num) 
    {
        // Convert the integer to a string to easily manipulate individual digits.
        String n = Integer.toString(num);
        // Convert the string to a character array to facilitate swapping.
        char[] c = n.toCharArray();
        int len = c.length;
        for(int i = 0; i < len; i++)
        {
            // Initialize max to the current character and max_ind to its index.
            char max = c[i];
            int max_ind = i;
            // Check for any larger digits to the right of the current digit.
            for(int j = i + 1; j < len; j++)
            {
                // Update max and max_ind if we find a larger digit.
                if(max <= c[j])
                {
                    max = c[j];
                    max_ind = j;
                }
            }
            // If max is different from the current digit, we found a larger digit to swap with.
            if(max != c[i])
            {
                char temp = c[i];
                c[i] = c[max_ind];
                c[max_ind] = temp;
                break;
            }
        }
        // Convert the array to an Integer and return it
        String res = new String(c);
        return Integer.parseInt(res);
    }
}