package lab_2.BaiTap1;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {

        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input numb:");

        n = scanner.nextInt();
        if (n % 2 == 0) {
            System.out.println(n + " is even");
        } else {
            System.out.println(n + " is odd");
        }
    }
}
