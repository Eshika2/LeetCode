package _1TwoSum;
import java.util.Arrays;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i=0 ; i<nums.length ; i++) {
            for (int j=i+1 ; j<nums.length ; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        TwoSum obj = new TwoSum();

        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;

        int[] nums2 = {3,2,4};
        int target2 = 6;

        int[] nums3 = {3,3};
        int target3 = 6;

        int[] results1 = obj.twoSum(nums1, target1);
        System.out.println("Output: " + Arrays.toString(results1));

        int[] results2 = obj.twoSum(nums2, target2);
        System.out.println("Output: " + Arrays.toString(results2));

        int[] results3 = obj.twoSum(nums3, target3);
        System.out.println("Output: " + Arrays.toString(results3));
    }
}
//[2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
//Example 2:
//
//Input: nums = [3,2,4], target = 6
//Output: [1,2]
//Example 3:
//
//Input: nums = [3,3], target = 6
//Output: [0,1]