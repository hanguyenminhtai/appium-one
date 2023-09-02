package lab_13;

import java.util.Scanner;

public class UtilsBook {

    public static Book inputBookInfo() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input ISBN: ");
        String isbn = scanner.nextLine();

        System.out.print("Please input title: ");
        String title = scanner.nextLine();

        System.out.print("Please input author: ");
        String author = scanner.nextLine();

        System.out.print("Please input year: ");
        int year = scanner.nextInt();

        return new Book(isbn, title, author, year);
    }

    public static Book inputBookUpdated() {

        Scanner scanner = new Scanner(System.in);

        String isbn = inputISBN();

        if (isbn.equalsIgnoreCase("exit")) {
            return null;
        }

        System.out.println("Input info need to update");
        System.out.print("Please input title: ");
        String title = scanner.nextLine();

        System.out.print("Please input author: ");
        String author = scanner.nextLine();

        System.out.print("Please input year: ");
        int year = scanner.nextInt();

        return new Book(isbn, title, author, year);
    }

    public static String inputISBN() {
        Scanner scanner = new Scanner(System.in);
        String isbn;
        int countInputISBN = 0;
        do {
            if (countInputISBN > 0) {
                System.out.println("ISBN is not in List!!!");
            }
            System.out.print("Please input ISBN: ");
            isbn = scanner.nextLine();

            if (isbn.equalsIgnoreCase("exit")) {
                break;
            }
            countInputISBN++;

            if (countInputISBN == 10) {
                throw new RuntimeException("Wrong!!!");
            }
        } while (!BookController.isBookExistInList(BookController.getBookList(FileAddress.absolutePath), isbn));
        return isbn;
    }
}
