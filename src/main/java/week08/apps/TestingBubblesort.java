package week08.apps;

import week08.utils.ArrayUtils;

import java.util.Arrays;

public class TestingBubblesort {
    public static void main(String[] args) {
        int [] data = {7, 2, 3, 1, -4, 18, 2};
        ArrayUtils.bubblesort(data);

        System.out.println(Arrays.toString(data));
    }
}
