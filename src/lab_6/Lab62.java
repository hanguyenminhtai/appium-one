package lab_6;

import java.util.Scanner;

public class Lab62 {
    public static void main(String[] args) {

        String myPassword = "password123", pass;
        Scanner passInput = new Scanner(System.in);
        int c = 0;
        while (c <= 2) {
            System.out.println("Pls input pass:");
            pass = passInput.nextLine();
            if (pass.equals(myPassword)) {
                System.out.println("Welcome!");
            } else {
                System.out.println("Again");
                c++;
            }
        }
    }
}
