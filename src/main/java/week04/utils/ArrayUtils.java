package week04.utils;

public class ArrayUtils {
    public static int overwrite(int [] data, int pos){
        validateArray(data);
        validatePosition(data, pos);

        return overwrite(data, pos, 0);
    }

    public static int overwrite(int [] data, int pos, int value){
        validateArray(data);
        validatePosition(data, pos);

        int replaced = data[pos];
        data[pos] = value;
        return replaced;
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

    public static int[] resizeInsert(int [] data, int pos, int value){
        validateArray(data);
        validatePositionInclusive(data, pos);

        int [] resized = new int[data.length+1];

        for (int i = 0; i < pos; i++) {
            resized[i] = data[i];
        }
        resized[pos] = value;
        for(int i = pos+1; i < resized.length; i++){
            resized[i] = data[i-1];
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

    public static int shiftInsert(int [] data, int pos, int value){
        validateArray(data);
        validatePosition(data, pos);

        int deleted = data[data.length-1];

        for (int i = data.length-1; i > pos; i--) {
            data[i] = data[i-1];
        }

        data[pos] = value;
        return deleted;
    }

    public static boolean contains(int [] data, int value, int pos){
        for(int i = 0; i < pos; i++){
            if(data[i] == value){
                return true;
            }
        }
        return false;
    }

    public static int [] deduplicate(int [] data){
        validateArray(data);

        int [] dest = new int[data.length];

        int tracker = 0;
        for (int i = 0; i < data.length; i++) {
            if(!contains(dest, data[i], tracker)){
                dest[tracker] = data[i];
                tracker++;
            }
        }
        // Todo: Create a smaller version of dest
        return dest;
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

    private static void validatePositionInclusive(int[] data, int pos) {
        if(pos < 0 || pos > data.length){
            throw new ArrayIndexOutOfBoundsException("Supplied position must be within the boundary of the array");
        }
    }
}
