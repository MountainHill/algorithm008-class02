package week01;

import java.util.HashMap;

public class twoSum_1 {
//    public int[] twoSum(int[] nums, int target) {
//        for (int i=0; i<nums.length-1; i++) {
//            for (int j=i+1; j<nums.length; j++) {
//                int total = nums[i] + nums[j];
//                if (total == target) {
//                    return new int[]{i, j};
//                }
//            }
//        }
//        return null;
//    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        for (int i=0; i<nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            else {
                map.put(nums[i], i);
            }
        }
        return null;
    }
}
