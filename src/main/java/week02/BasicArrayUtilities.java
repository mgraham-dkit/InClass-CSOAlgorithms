package week02;

public class BasicArrayUtilities {
    public static int findMax(int [] numbers){
        if(numbers == null){
            throw new NullPointerException("Supplied array can not be null");
        }

        if(numbers.length == 0){
            throw new IllegalArgumentException("Supplied array cannot be empty");
        }

        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] > max){
                max = numbers[i];
            }
        }
        return max;
    }
}
