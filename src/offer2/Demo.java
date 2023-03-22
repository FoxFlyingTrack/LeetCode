package offer2;

import java.util.Arrays;
import java.util.HashSet;

/**
 * 数组中重复的数字
 * <p>
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
 *
 * @author rj
 */
public class Demo {
    /**
     * 排序
     *
     * @param nums 一个有重复数字的数组
     * @return 重复的数字
     */
    public int findRepeatNumber1(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; ; i++) {
            if (nums[i] == nums[i + 1]) {
                return nums[i];
            }
        }
    }

    /**
     * hash
     *
     * @param nums 一个有重复数字的数组
     * @return 重复的数字
     */
    public int findRepeatNumber2(int[] nums) {
        HashSet<Integer> vis = new HashSet<>();
        for (int i = 0; ; i++) {
            if (!vis.add(nums[i])) {
                return nums[i];
            }
        }
    }

    /**
     * 原地交换
     *
     * @param nums 一个有重复数字的数组
     * @return 重复的数字
     */
    public int findRepeatNumber3(int[] nums) {
        for (int i = 0; ; i++) {
            int j = nums[i];
            if (nums[j] == j){
                return j;
            }
            int t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;
        }
    }
}
