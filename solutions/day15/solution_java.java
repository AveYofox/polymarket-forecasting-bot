class Solution {
    public long minimumSteps(String s) {
        int i = s.length() - 1;
        long minOps = 0;
        while(i>= 0 && s.charAt(i) == '1') {
            i--;
        }
        if(i == -1) {
            return minOps;
        }
        int zeroIndex = i;
        while(i >= 0) {
            if(s.charAt(i) == '1') {
                minOps += zeroIndex - i;
                zeroIndex--;
            }
            i--;
        }
        return minOps;
    }
}
