package week12.app;

import static week12.utils.SortingUtils.quicksort;

public class DemoSorting {
    public static void main(String[] args) {
        // Null array:
        int [] data = null;
        try{
            quicksort(data);
        }catch(IllegalArgumentException e){
            System.out.println("Exception occurred when attempting to sort a null array");
            System.out.println("ERROR: " + e.getMessage());
        }

        // Empty array:
        data =  new int[]{};
        testSort(data);

        // Array with 2 elements in already sorted order:
        data = new int[]{1, 4};
        testSort(data);

        // Array with 2 elements in unsorted order:
        data = new int[]{7, 4};
        testSort(data);

        // Array with several elements in unsorted order:
        data = new int[]{1, 5, 10, 7, 4};
        testSort(data);

        // Array with most elements in sorted order:
        data = new int[]{1, 5, 7, 7, 4};
        testSort(data);
    }

    private static void testSort(int[] data) {
        System.out.print("Original array: ");
        displayArray(data);
        quicksort(data);
        System.out.print("Updated array: ");
        displayArray(data);
        System.out.println("----------------------------");
    }

    private static void displayArray(int[] data) {
        if(data == null){
            System.out.println("Cannot print content of a null array");
            return;
        }
        if(data.length == 0){
            System.out.println("Array is empty.");
            return;
        }
        System.out.print("[");
        for (int i = 0; i < data.length - 1; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.print(data[data.length - 1] + "]\n");

    }
}
