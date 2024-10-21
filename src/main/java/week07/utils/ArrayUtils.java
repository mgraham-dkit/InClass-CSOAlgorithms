package week07.utils;

public class ArrayUtils {
    public static int search(int [] data, int value){
        for (int i = 0; i < data.length; i++) {
            if(data[i] == value){
                return i;
            }else if(data[i] > value){
                return -1;
            }
        }
        return -1;
    }

    public static int [] partition(int [] data, int pivot){
        validateArray(data);

        int [] left = new int[data.length];
        int [] right = new int[data.length];

        int leftCount = 0;
        int rightCount = 0;

        for (int value : data) {
            if(value <= pivot){
                left[leftCount++] = value;
            }else{
                right[rightCount++] = value;
            }
        }

        return merge(left, right);
    }

    public static int[] merge(int [] data1, int[] data2){
        validateArray(data1);
        validateArray(data2);
        return merge(data1, data1.length, data2, data2.length);
    }

    public static int[] merge(int[] data1, int data1Count, int[] data2, int data2Count) {
        validateArray(data1);
        validateArray(data2);

        validateCount(data1, data1Count);
        validateCount(data2, data2Count);

        int [] merged = new int[data1Count + data2Count];
        int count = 0;

        for(int i = 0; i < data1Count; i++) {
            merged[count++] = data1[i];
        }

        for(int i = 0; i < data2Count; i++) {
            merged[count++] = data2[i];
        }

        return merged;
    }

    private static void validateCount(int[] data1, int data1Count) {
        if(data1Count >= data1.length || data1Count < 0){
            throw new IllegalArgumentException("Number of elements cannot be outside bounds of array");
        }
    }

    private static void validateArray(int[] data) {
        if (data == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
    }
}
