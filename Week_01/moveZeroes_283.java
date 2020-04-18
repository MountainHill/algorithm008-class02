package week01;

public class moveZeroes_283 {
    /*
    * moveZeroes
    * */
    public void moveZeroes(int[] nums) {
        int numsSize = nums.length;
        int j = 0;
        for (int i = 0; i < numsSize; i++) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }
        while (j < numsSize) {
            nums[j++] = 0;
        }
    }

    //遍历数组，碰到0则寻找第一个非0的，替换掉，若找不到则表示后面全是0
    public void moveZeroes1(int[] nums) {
        for (int i=0; i < nums.length-1; i++) {
            int num = nums[i];
            if (num == 0) {
                //寻找后面第一个非0的index
                int index = firstNonZero(nums, i);
                if (index == -1) {
                    break;
                }
                else {
                    nums[i] = nums[index];
                    nums[index] = 0;
                }
            }
        }
    }

    private int firstNonZero(int[] nums, int from) {
        int index = -1;
        for (int i=from+1; i < nums.length; i++) {
            if (nums[i] != 0) {
                index = i;
                break;
            }
        }
        return index;
    }
}
