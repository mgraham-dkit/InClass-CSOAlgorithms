package week08.utils;

public class ArrayUtils {


    public static void bubblesort(int [] nums){
        boolean swapped = true;
        int i = 0;
        while(swapped){
            swapped = false;
            for (int j = 0; j < nums.length-i-1; j++) {
                if(nums[j] > nums[j+1]){
                    swap(nums, j, j+1);
                    swapped = true;
                }
            }
            i++;
        }
    }

    private static void swap(int[] nums, int pos1, int pos2) {
        int temp = nums[pos1];
        nums[pos1] = nums[pos2];
        nums[pos2] = temp;
    }
}
