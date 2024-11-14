package week09.utils;

import java.util.HashMap;

public class Recursion {
    private static final HashMap<Integer, Integer> memo = new HashMap<>();
    public static int fibonacci(int n){
        System.out.println("Calculating fibonacci #" + n);
        if(n < 0){
            throw new IllegalArgumentException("Fibonacci numbers must be 0 or greater");
        }

        if(n <= 1){
            return n;
        }

        if(memo.containsKey(n)){
            return memo.get(n);
        }

        int result = fibonacci(n-2) + fibonacci(n-1);
        memo.put(n, result);

        return result;
    }

    public static int sum(int [] data){
        return sum(data, 0);
    }

    public static int sum(int [] data, int startPos){
        if(startPos == data.length-1){
            return data[startPos-1];
        }

        return data[startPos] + sum(data, startPos+1);
    }


    public static int search(int [] data, int value){
        return search(data, value, 0, data.length-1);
    }

    private static int search(int [] data, int value, int left, int right){
        if(left > right){
            return -1;
        }

        int mid = left + (right-left)/2;
        if(data[mid] == value){
            return mid;
        }else if(data[mid] < value){
            left = mid+1;
        }else{
            right = mid-1;
        }

        return search(data, value, left, right);
    }

    public static void delete(String [] data, int count){
        for(int i = count; i < data.length; i++){
            data[i-count] = data[i];
        }
        for(int i = data.length-1; i > data.length-count-1; i--){
            data[i] = null;
        }
    }

    public static void main(String[] args) {
        int [] data = {10, 12, 18, 7, -1};
        System.out.println("sum = " + sum(data));
    }
}
