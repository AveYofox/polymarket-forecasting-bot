package solutions.day21;

import java.util.*;

public class Solution {
    private int maxUniqueSplits;

    public int maxUniqueSplit(String s) {
        maxUniqueSplits = 0;
        backtrack(s, 0, new HashSet<>());
        return maxUniqueSplits;
    }

    private void backtrack(String s, int start, Set<String> currentSet) {
        if (start == s.length()) {
            maxUniqueSplits = Math.max(maxUniqueSplits, currentSet.size());
            return;
        }

        for (int end = start + 1; end <= s.length(); end++) {
            String substring = s.substring(start, end);

            if (!currentSet.contains(substring)) {
                currentSet.add(substring);
                backtrack(s, end, currentSet);

                currentSet.remove(substring);
            }
        }
    }
}