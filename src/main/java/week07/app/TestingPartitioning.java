package week07.app;

import week07.utils.ArrayUtils;

public class TestingPartitioning {
    public static void main(String[] args) {
        int [] nums = {1, 4, 12, 56, 9, 1, -9, 12, -49, 20};
        int pivot = 8;
        int [] partitioned = ArrayUtils.partition(nums, pivot);

        display(partitioned);
    }

    public static void display(int [] data){
        for (int value : data) {
            System.out.println(value);
        }
    }
}
