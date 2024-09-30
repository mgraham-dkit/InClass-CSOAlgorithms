package week02;

import week04.ArrayUtils;

import java.util.Arrays;

public class ManipulatingArrays {
    public static void main(String[] args) {
        int [] nums = {1, 2, 3, 4, 5};
        int [] userSpecified = new int[5];

        System.out.println(BasicArrayUtilities.findMax(userSpecified));

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        System.out.println(Arrays.toString(nums));

        int [] resized = ArrayUtils.resizeInsert(nums, 5, 100);
        System.out.println(Arrays.toString(resized));
    }
}
