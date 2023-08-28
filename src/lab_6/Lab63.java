package lab_6;

import java.util.Scanner;

public class Lab63 {
    public static void main(String[] args) {

        String myStr = "100 minutes";
        String num = "";

        for (int i = 0; i < myStr.length(); i++) {
            int ascii = myStr.charAt(i);
            // ascii value of 0 is 48 & 9 is 57
            if (ascii >= 48 && ascii <= (57)) {
                num += (char) ascii;
            }
        }

        int inputOnlynumber = Integer.parseInt(num);
        System.out.println(inputOnlynumber);
    }
}
