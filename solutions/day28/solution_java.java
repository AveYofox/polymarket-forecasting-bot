import java.util.Arrays;

public class solution_java{
    public static void main(String[] args) {
        int[] arr = {5,25,75};  //any array with random elements.
        System.out.println(Arrays.toString(twoSum(arr, 30)));   //prints the resultant array with indices.
    }

    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;   //taking a left pointer to move forward.
        int right = numbers.length-1;   //taking a right pointer to move backward.
        while(left <= right){   //condition till it is true..
            int total = numbers[left] + numbers[right];     //checking the sum of the two numbers at index left & right.
            if(total == target) break;      //if founds equals to the target number, then break the loop.
            if(total < target) left++;      //checks if total is less than the target. If yes, it means that left index value is smaller. So incremented it.
            else right--;           //otherwise total is bigger, which means we need to get a smaller number. Hence decrement right index by one.
        }
        return new int[] {left+1, right+1};     //returns the final two indices which is 1-indexed
    }
}