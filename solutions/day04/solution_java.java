package solutions.day04;

import java.util.Arrays;

public class solution_java {
      public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int n = skill.length;
        long sum = 0;
        for(int i = 0; i < n; i++){
            sum += skill[i];
        }

        long target = sum / (n / 2 );

        long total = 0;
        int front = 0;
        int back = n - 1;
        while(front < back){
            if(skill[front] + skill[back] != target){
                return -1;
            }else{
                total += (skill[front] * skill[back]);
            }
            front++;
            back--;
        }

        return  total;

    }
}
