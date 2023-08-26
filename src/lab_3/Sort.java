package lab_3;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] intArr = {12, 34, 1, 16, 38};
        int n = intArr.length;
        int r;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (intArr[i] > intArr[j]) {
                    r = intArr[i];
                    intArr[i] = intArr[j];
                    intArr[j] = r;
                }
            }
        }

        System.out.println("Ket Qua: ");
        for (int i :intArr) {
            System.out.println(i);
        }
    }
}
