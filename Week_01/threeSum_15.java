package week01;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class threeSum_15 {
//    public List<List<Integer>> threeSum(int[] nums) {
//        LinkedList<List<Integer>> result = new LinkedList<>();
//        for (int i=0; i<nums.length-2; i++) {
//            for (int j=i+1; j<nums.length-1; j++) {
//                for (int z=j+1; z<nums.length; z++) {
//                    if ((nums[i] + nums[j] + nums[z]) == 0) {
//                        LinkedList<Integer> list = new LinkedList<Integer>();
//                        list.add(nums[i]);
//                        list.add(nums[j]);
//                        list.add(nums[z]);
//                        result.add(list);
//                    }
//                }
//            }
//        }
//        return result;
//    }

    public List<List<Integer>> threeSum(int[] nums) {
        LinkedList<List<Integer>> result = new LinkedList<>();
        int len = nums.length;

        Arrays.sort(nums);
        for (int i=0; i<nums.length-2; i++) {
            int a1 = nums[i];
            if (a1 > 0) break;
            if (i > 0 && nums[i] == nums[i-1]) continue;
            int L = i + 1;
            int R = len - 1;
            while (L < R) {
                int sum = nums[i] + nums[L] + nums[R];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[L], nums[R]));
                    while (L < R && nums[L] == nums[L+1]) L++;
                    while (L < R && nums[R] == nums[R-1]) R--;
                    L++;
                    R--;
                }
                else if (sum < 0) L++;
                else if (sum > 0) R--;
            }
        }

        return result;
    }
}
