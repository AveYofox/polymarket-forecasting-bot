package solutions.day01;

public class solution_java {
    public boolean canArrange(int[] arr, int k) {
        int[] remainder = new int[k];

        for(int i  = 0;i < k;i++){
            remainder[i] = 0;
        }

        for(int i  = 0;i < arr.length;i++){
           
            if(arr[i] < 0){
                int num = arr[i];
                int modu = ((num % k) + k ) % k;
                remainder[modu]++;
            }else{
                int modu = arr[i] % k;
                remainder[modu]++;
            }
        }

        if(remainder[0]  % 2 != 0){
                return false;
            }

        for(int i  = 1;i <= k / 2;i++){
            
            int complement = k - i ;
            if(remainder[complement] != remainder[i] ){
                return false;
            }
        }

        return true;
    }
}
