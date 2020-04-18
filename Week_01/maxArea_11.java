package week01;

/*
* 1.第一个跟后面所有的面积，然后第二个跟后面所有的面积...
* */

public class maxArea_11 {
//    public int maxArea(int[] height) {
//        int total = 0;
//        for (int i=0; i<height.length; i++) {
//            int h0 = height[i];
//            for (int j=i+1; j<height.length; j++) {
//                int w = j - i;
//                int h = Math.min(h0, height[j]);
//                total = Math.max(total, w*h);
//            }
//        }
//        return total;
//    }

    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int total = 0;
        while (i < j) {
            int left = height[i];
            int right = height[j];
            total = Math.max(total, Math.min(left, right)*(j-i));
            if (left <= right) i++;
            else j--;

        }
        return total;
    }
}
