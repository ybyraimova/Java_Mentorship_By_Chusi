package problemSolving;

import java.util.Arrays;

public class MergeTwoArrays {
    /*
    merge values from two given arrays amd return them as one array
     */

    /*
    1.
     */

    public static int [] mergeTwoIntArrs(int [] a, int [] b) {
        int[] c = new int[a.length + b.length]; //we don't know the length of arrays.
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }

        int bIndex = 0;
        for (int j = a.length; j < c.length; j++) {
                c[j] = b[bIndex];
                bIndex++;
            }
        return c;
    }

    public static void main(String[] args) {
        int ints [] = {1,2,3};
        int ints2 [] = {4,5,50,60,70,100};
        int ints3 [] = mergeTwoIntArrs(ints, ints2);
        System.out.println(Arrays.toString(ints3));
    }
}
