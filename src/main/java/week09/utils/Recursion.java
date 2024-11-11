package week09.utils;

public class Recursion {
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

    public static void main(String[] args) {
        int [] data = {1, 4, 6, 12, 34, 55, 789, 1000};
        int value = 1001;
        int pos = search(data, value);
        if(pos != -1) {
            System.out.println("Data appears in slot " + pos);
        }else{
            System.out.println("Not found.");
        }
    }
}
