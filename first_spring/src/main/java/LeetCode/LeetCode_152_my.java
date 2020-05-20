package LeetCode;

/**
 * @auter liwinallucky
 */
public class LeetCode_152_my {
    public int maxProduct(int[] nums) {
        int prevMax = nums[0], res = nums[0];
        int temp1 = 0, temp2 = 0;
        for (int i = 1; i < nums.length; i++) {
            temp1 = nums[i] * prevMax;
            prevMax = Math.max(Math.max(temp1, temp2), nums[i]);
            res = Math.max(res, prevMax);
        }
        return res;
    }
}
