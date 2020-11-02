package Problem1Solving;

import java.util.Arrays;

public class Problem1Solving {

    public static int findSum(int[] arr) {
        System.out.println(Arrays.toString(arr));
        int length = arr.length;
        int included = arr[0];
        int excluded = 0;
        int excluded_new;
        int i;

        for (i = 1; i < length; i++) {
            /* current max excluding i */
            excluded_new = Math.max(included, excluded);
            /* current max including i */
            included = excluded + arr[i];
            excluded = excluded_new;
        }

        /* return max of incl and excl */
        return (Math.max(included, excluded));
    }

}
