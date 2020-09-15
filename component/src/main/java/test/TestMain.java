package test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author liuw
 * @date 2020/9/15
 */
public class TestMain {

    public static void main(String[] args) {
        //int[] nums = {1, 7, 11, 15, 2};
        int[] nums = {3,3};
        int target = 6;

        twoSum(nums, target);
    }
    

    /**
     * 暴力解题法
     */
//    public static int[] twoSum(int[] nums, int target) {
//
//        int[] result = new int[2];
//
//        List<Integer> integerList = new ArrayList<>();
//        // 剔除不符合要求的元素
//        // 大于target的元素
//        int min = nums[0];
//        for (int e : nums) {
//            if(e <= target) {
//                integerList.add(e);
//            }
//            // 寻找最小值
//            if(e < min) {
//                min = e;
//            }
//        }
//        // 与最小值之和大于target的元素
//        
//        
//        for(int i = 0; i < nums.length; i++) {
//            for(int j = 0; j < nums.length; j++) {
//                // i 和 j 不能相等，相等则值加1，且值不能超过数组下表
//                if(i == j) {
//                    continue;
//                }
//                if(nums[i] + nums[j] == target) {
//                    result[0] = i;
//                    result[1] = j;
//                    // System.out.println("结果：");
//                    System.out.println(Arrays.toString(result));
//                    return result;
//                }
//            }
//        }
//
//        return result;
//
//    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< nums.length; i++) {
            if(map.containsKey(target - nums[i])) {
                System.out.println(Arrays.toString(new int[] {map.get(target-nums[i]),i}));
                return new int[] {map.get(target-nums[i]),i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
