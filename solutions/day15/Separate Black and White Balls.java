class Solution {
    public long minimumSteps(String s) {
        int[] a = new int[s.length()];
        long count=0;
        int n=0;
        for (int i = 0; i < s.length(); i++) {
            a[i]=s.charAt(i);
            if (a[i]==49) n++;   //49 is ASCII value of 1
            else if (a[i]==48) count+=n;    //48 is ASCII value of 0
        }return count;
    }
}
