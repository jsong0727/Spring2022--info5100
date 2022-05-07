package Question5;

import java.util.Arrays;

public class KthLargest {
    public static void main(String[] args) {
        int[] input = {3, 2, 1, 5, 6, 4};
        System.out.println(findKthLargest(input, 2));
    }

    public static int findKthLargest(int[] nums, int k) {
        int length = nums.length;
        Arrays.sort(nums);
        return nums[length - k];
    }
}
