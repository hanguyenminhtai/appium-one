package lab_2.BaiTap1;

import java.util.Scanner;

public class CalBMI {

    public static void main(String[] args) {

        float inputHeight, inputWeight, indexBMI;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please input height(m):");
        inputHeight = scanner.nextFloat();
        System.out.print("Please input weight(kg):");
        inputWeight = scanner.nextFloat();

        //CalBMI
        indexBMI = inputWeight / (inputHeight * 2);
        System.out.printf("Index BMI = %.1f\n", indexBMI);

        //Classification based on index
        if (indexBMI < 18.5) {
            System.out.println("UnderWeight");
        } else if (indexBMI <= 24.9) {
            System.out.println("Normal Weight");
        } else if (indexBMI <= 29.9) {
            System.out.println("OverWeight");
        } else {
            System.out.println("Obesity");
        }
    }
}
