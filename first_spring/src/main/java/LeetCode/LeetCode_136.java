package LeetCode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @auter liwinallucky
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 *
 * 说明：
 *
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 *
 * 示例 1:
 *
 * 输入: [2,2,1]
 * 输出: 1
 * 示例 2:
 *
 * 输入: [4,1,2,1,2]
 * 输出: 4
 *
 */
public class LeetCode_136 {
    @Test
    public int singleNumber(int[] nums) {
        int single=0;
        for (int num:nums) {
            single^=num;//相同为0，相异为1
        }
        return single;
    }

    public static void main(String[] args) {
        LeetCode_136 l=new LeetCode_136();
        int[] nums={3,2,3};
        System.out.println(l.singleNumber(nums));
        System.out.println(1^3);
    }
	
}
