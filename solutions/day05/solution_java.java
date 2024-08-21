package solutions.day05;

import java.util.Arrays;

public class solution_java {
    public boolean checkInclusion(String s1, String s2) {
        int[] h1 = new int[26];
        int[] h2 = new int[26];
        
        int l1 = s1.length();
        int l2 = s2.length();

        if(l1 > l2) return false;

        for(int i = 0; i < l1; i++){
            h1[s1.charAt(i) - 'a'] += 1;
            h2[s2.charAt(i) - 'a'] += 1;
        }

        if(Arrays.equals(h1, h2)) return true;

        for(int i = 1; i <= l2 - l1; i++){
           //remove
            h2[s2.charAt(i - 1) - 'a'] -= 1;
            //add
            h2[s2.charAt(i + l1 - 1) - 'a'] += 1;

            if(Arrays.equals(h1, h2)) return true;
        }

        return false;

    }
}
