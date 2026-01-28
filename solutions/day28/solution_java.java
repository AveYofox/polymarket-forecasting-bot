import java.util.Arrays;

public class solution_java{
    public static void main(String[] args) {
        int[] arr = {5,25,75};  //any array with random elements.
        System.out.println(Arrays.toString(twoSum(arr, 30)));   //prints the resultant array with indices.
    }

    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;
        while(left <= right){
            int total = numbers[left] + numbers[right];
            if(total == target) break;
            if(total < target) left++;
            else right--;
        }
        return new int[] {left+1, right+1};
    }
}