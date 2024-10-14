package week06.app;

import week06.utils.ArrayUtils;

import java.util.Arrays;

public class TestingMerged {
    public static void main(String[] args) {
        int [] nums1 = {1, 3, 2, 4, 5, 3, 6, 7, 8, 10};
        int [] nums2 = {12, 35, 6, 2, 7};

        int [] merged = ArrayUtils.merge(nums1, nums2);
        System.out.println("Merged array: " + Arrays.toString(merged));
    }
}
