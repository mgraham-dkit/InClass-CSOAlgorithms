package week06.app;

import week06.utils.ArrayUtils;

import java.util.Arrays;

public class TestingDeduplication {
    public static void main(String[] args) {
        int [] data = {1, 1, 2, 4, 5, 7, 8, 10, 11, 12, 12, 12, 12, 12, 34};

        int [] unsortedDedup = ArrayUtils.deduplicate(data);
        int [] sortedDedup = ArrayUtils.deduplicateSorted(data);

        System.out.println(Arrays.toString(unsortedDedup));
        System.out.println(Arrays.toString(sortedDedup));
    }
}
