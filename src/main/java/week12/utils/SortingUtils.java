package week12.utils;

public class SortingUtils {
    public static void quicksort(int [] data){
        if(data == null){
            throw new IllegalArgumentException("Array to be sorted cannot be null");
        }
        lomutoQuicksort(data, 0, data.length-1);
    }

    private static void lomutoQuicksort(int [] data, int low, int high) {
        if (low < high) {
            int partitionPoint = lomutoPartition(data, low, high);

            lomutoQuicksort(data, low, partitionPoint - 1);
            lomutoQuicksort(data, partitionPoint + 1, high);
        }
    }

    private static int lomutoPartition(int [] data, int low, int high){
        int pivot = data[high];
        int unpartitionedIndex = low;
        for(int i = low; i < high; i++){
            if(data[i] < pivot){
                swap(data, i, unpartitionedIndex);
                unpartitionedIndex++;
            }
        }
        swap(data, unpartitionedIndex, high);
        return unpartitionedIndex;
    }

    private static void swap(int[] nums, int pos1, int pos2) {
        int temp = nums[pos1];
        nums[pos1] = nums[pos2];
        nums[pos2] = temp;
    }
}
