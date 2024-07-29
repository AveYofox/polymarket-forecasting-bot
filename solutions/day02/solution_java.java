package solutions.day02;

import java.util.Arrays;
import java.util.HashMap;

public class solution_java {
     public int[] arrayRankTransform(int[] arr) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        int[] ans = new int[arr.length];
        int[] temp = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            temp[i] = arr[i];

        }
        Arrays.sort(temp);

        int n = arr.length;

        int j = 1;

        for(int i = 0; i < n; i++){
            if(!hs.containsKey(temp[i])){
                hs.put(temp[i], j);
                j++;
            }else{
                continue;
            }
        }

        for(int i = 0; i < n; i++){
            ans[i] = hs.get(arr[i]);

        }

        return ans;

    }
}
