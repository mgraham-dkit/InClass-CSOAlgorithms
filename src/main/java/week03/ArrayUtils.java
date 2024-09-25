package week03;

public class ArrayUtils {
    public static int overwrite(int [] data, int pos){
        validateArray(data);

        validatePosition(data, pos);

        int deleted = data[pos];
        data[pos] = 0;
        return deleted;
    }

    public static int [] resizeDelete(int [] data, int pos){
        validateArray(data);

        validatePosition(data, pos);

        int [] resized = new int[data.length-1];

        for (int i = 0; i < pos; i++) {
            resized[i] = data[i];
        }

        for(int i = pos; i < resized.length; i++){
            resized[i] = data[i+1];
        }
        return resized;
    }

    public static int shiftDelete(int [] data, int pos){
        validateArray(data);
        validatePosition(data, pos);

        int deleted = data[pos];

        for (int i = pos; i < data.length-1; i++) {
            data[i] = data[i+1];
        }

        data[data.length-1] = 0;

        return deleted;
    }

    private static void validatePosition(int[] data, int pos) {
        if(pos < 0 || pos >= data.length){
            throw new ArrayIndexOutOfBoundsException("Supplied position must be within the boundary of the array");
        }
    }

    private static void validateArray(int[] data) {
        if(data == null){
            throw new IllegalArgumentException("Array cannot be null");
        }
    }


}
