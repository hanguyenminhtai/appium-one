package lab_3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Merge {

    public static void main(String[] args) {
        int[] intArr1 = {1, 12, 16, 28, 34};
        int[] intArr2 = {1, 13, 16, 27, 99};
        int n = intArr1.length;
        int m = intArr2.length;
        int[] intArr3 = new int[n + m];

        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            if (intArr1[i] < intArr2[j]) {
                intArr3[k++] = intArr1[i++];
            } else {
                intArr3[k++] = intArr2[j++];
            }
        }

        while (i < n) {
            intArr3[k++] = intArr1[i++];
        }

        while (j < m) {
            intArr3[k++] = intArr2[j++];
        }

        System.out.println("Ket Qua:");
        for (int p : intArr3) {
            System.out.println(p);
        }
    }
}
