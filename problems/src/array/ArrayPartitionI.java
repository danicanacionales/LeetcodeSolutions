package array;

import java.util.Arrays;

public class ArrayPartitionI {
    /*
    Created by danicanacionales on 27/03/2019

    561. Array Partition I

    Get sum of all minimum pairs

    Example 1:
        Input: [1,4,3,2]
        Output: 4
    */

    public static void main(String[] args) {
        int [] nums = {1, 4, 3, 2};
        System.out.println(new ArrayPartitionI().arrayPairSum(nums));
    }

    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);

        int sum = 0;
        for(int i = 0; i < nums.length; i += 2){
            sum += nums[i];
        }

        return sum;
    }
}
