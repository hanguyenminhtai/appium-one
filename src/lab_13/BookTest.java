package lab_13;

import java.util.Scanner;

public class BookTest extends UtilsBook {

    public static void main(String[] args) {

        BookController.checkAndCreateFile(FileAddress.absolutePath);
        int option = 0;
        boolean isContinue = true;
        Scanner scanner = new Scanner(System.in);

        while (isContinue) {
            BookController.printMenu();
            System.out.print("Please choose option: ");
            option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    System.out.println("=== Add new book ===");
                    Book newBook = UtilsBook.inputBookInfo();

                    BookController.saveBookList(BookController.addNewBook(newBook, FileAddress.absolutePath), FileAddress.absolutePath);
                    System.out.printf("The book is saved\n");
                    break;
                case 2:
                    if (BookController.getBookList(FileAddress.absolutePath).size() == 0) {
                        System.out.println("Please first add book to find book!!");
                    } else {
                        System.out.println("=== Find Book ===");
                        String isbnToFind = UtilsBook.inputISBN();
                        if (isbnToFind.equalsIgnoreCase("exit")) {
                            break;
                        }
                        BookController.findBook(isbnToFind, FileAddress.absolutePath);
                    }
                    break;
                case 3:
                    if (BookController.getBookList(FileAddress.absolutePath).size() == 0) {
                        System.out.println("Please first add book to update book!!");
                    } else {
                        System.out.println("=== Update Book ===");
                        Book updatedBook = UtilsBook.inputBookUpdated();
                        if (updatedBook == null) {
                            break;
                        }
                        BookController.saveBookList(BookController.updateBook(updatedBook, FileAddress.absolutePath), FileAddress.absolutePath);
                        System.out.printf("The book is update into DB with info: Book {ISBN:%s, Title:%s, Author:%s, Year:%d}\n", updatedBook.getIsbn(), updatedBook.getTitle(), updatedBook.getAuthor(), updatedBook.getYear());
                    }
                    break;
                case 4:
                    if (BookController.getBookList(FileAddress.absolutePath).size() == 0) {
                        System.out.println("Please first add book to delete!!");
                    } else {
                        System.out.println("=== Delete Book ====");
                        String isbnToDelete = UtilsBook.inputISBN();
                        if (isbnToDelete.equalsIgnoreCase("exit")) {
                            break;
                        }
                        BookController.saveBookList(BookController.deleteBook(isbnToDelete, FileAddress.absolutePath), FileAddress.absolutePath);
                    }
                    break;
                case 5:
                    System.out.println("=== List Book in DB ===");
                    if (BookController.getBookList(FileAddress.absolutePath).size() == 0) {
                        System.out.println("There are no any books in DB !!!");
                    } else {
                        System.out.println(BookController.getBookList(FileAddress.absolutePath));
                    }
                    break;
                case 0:
                    isContinue = false;
                    break;
                default:
                    System.out.println("Option is wrong!!");
                    break;
            }
        }
    }
}
