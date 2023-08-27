package lab_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuFive {

    public static void MenuOption() {
        System.out.println("Menu");
        System.out.println("1. Add number into ArrayList");
        System.out.println("2. Print numbers");
        System.out.println("3. Get maximum");
        System.out.println("4. Get minimum");
        System.out.println("5. Search number");
        System.out.println("6. Exit!!");
    }

    public static List<Integer> myArrayList = new ArrayList<>();

    public static List<Integer> originalArrayList() {
        for (int i = 0; i < 5; i++) {
            myArrayList.add(i);
        }
        return myArrayList;
    }

    public static List<Integer> getMyArrayList() {
        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println(myArrayList.get(i));
        }
        return myArrayList;
    }

    public static List<Integer> addNumber() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Add number:");
        int r = scanner.nextInt();
        myArrayList.add(r);
        return myArrayList;
    }

    public static void getMaximum() {
        int max = myArrayList.get(0);

        for (int i = 0; i < myArrayList.size(); i++) {
            if (myArrayList.get(i) > max)
                max = myArrayList.get(i);
        }
        System.out.println("Maximum is :" + max);
    }

    public static void getMiximum() {
        int min = myArrayList.get(0);

        for (int i = 0; i < myArrayList.size(); i++) {
            if (myArrayList.get(i) < min)
                min = myArrayList.get(i);
        }
        System.out.println("Minximum is:" + min);
    }

    public static void searchNumber() {
        int flag = 0, i = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number u want find:");
        int r = scanner.nextInt();

        for (i = 0; i < myArrayList.size(); i++) {
            if (myArrayList.get(i) == r) {
                flag = 1;
                break;
            } else {
                flag = 0;
            }
        }
        if (flag == 1) {
            System.out.println("Numb found at:" + (i + 1));
        } else {
            System.out.println("Numb not found!");
        }
    }

    public static void main(String[] args) {

        boolean condition = true;
        originalArrayList();
        MenuOption();

        while (condition) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Input Option:");
            int w = scanner.nextInt();

            switch (w) {
                case 1:
                    addNumber();
                    break;
                case 2:
                    getMyArrayList();
                    break;
                case 3:
                    getMaximum();
                    break;
                case 4:
                    getMiximum();
                    break;
                case 5:
                    searchNumber();
                    break;
                case 6:
                    condition = false;
                    break;
                default:
                    System.out.println("This option is not available!");
            }
        }
    }
}
