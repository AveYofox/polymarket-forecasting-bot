class Solution 
{
    public int maximumSwap(int num) 
    {
        String n = Integer.toString(num);
        char[] c = n.toCharArray();
        int len = c.length;
        for(int i = 0; i < len; i++)
        {
            char max = c[i];
            int max_ind = i;
            for(int j = i + 1; j < len; j++)
            {
                if(max <= c[j])
                {
                    max = c[j];
                    max_ind = j;
                }
            }
            if(max != c[i])
            {
                char temp = c[i];
                c[i] = c[max_ind];
                c[max_ind] = temp;
                break;
            }
        }
        String res = new String(c);
        return Integer.parseInt(res);
    }
}