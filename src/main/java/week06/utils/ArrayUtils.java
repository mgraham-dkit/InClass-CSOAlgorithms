package week06.utils;

public class ArrayUtils {
    public static boolean contains(int[] data, int value, int pos) {
        for (int i = 0; i < pos; i++) {
            if (data[i] == value) {
                return true;
            }
        }
        return false;
    }

    public static int[] deduplicate(int[] data) {
        validateArray(data);

        int[] dest = new int[data.length];

        int tracker = 0;
        for (int i = 0; i < data.length; i++) {
            if (!contains(dest, data[i], tracker)) {
                dest[tracker] = data[i];
                tracker++;
            }
        }

        return resize(dest, tracker);
    }

    public static int[] deduplicateSorted(int[] data) {
        validateArray(data);

        int[] dest = new int[data.length];

        if (data.length == 0) {
            return dest;
        }

        int tracker = 0;
        int prev = data[0];
        for (int i = 1; i < data.length; i++) {
            if (prev != data[i]) {
                dest[tracker] = prev;
                tracker++;
                prev = data[i];
            }
        }

        dest[tracker++] = prev;

        return resize(dest, tracker);
    }

    public static int[] resize(int[] nums, int numElements){
        if(numElements < 0){
            throw new IllegalArgumentException("Number of elements to be used cannot be less than 0");
        }

        int [] resized = new int[numElements];
        for (int i = 0; i < numElements && i < nums.length; i++) {
            resized[i] = nums[i];
        }

        return resized;
    }

    public static int[] merge(int [] data1, int[] data2){
        validateArray(data1);
        validateArray(data2);

        int [] merged = new int[data1.length + data2.length];
        int count = 0;

        for (int num : data1) {
            merged[count++] = num;
        }

        for (int num : data2) {
            merged[count++] = num;
        }

        return merged;
    }

    private static void validateArray(int[] data) {
        if (data == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
    }
}
