package week08.utils;

public class ArrayUtils {
    public static void selectionSort(int [] nums){
        validateArray(nums);

        for(int startSlot = 0; startSlot < nums.length-1; startSlot++){
            int minPos = startSlot;
            for (int i = startSlot+1; i < nums.length; i++) {
                if(nums[i] < nums[minPos]){
                    minPos = i;
                }
            }
            swap(nums, startSlot, minPos);
        }
    }

    public static void bubbleSort(int [] nums){
        validateArray(nums);

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

    private static void validateArray(int[] nums) {
        if(nums == null){
            throw new IllegalArgumentException("Null array cannot be sorted.");
        }
    }

    private static void swap(int[] nums, int pos1, int pos2) {
        int temp = nums[pos1];
        nums[pos1] = nums[pos2];
        nums[pos2] = temp;
    }
}
