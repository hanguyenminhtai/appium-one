package lab_13;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BookController {

    public static void printMenu() {
        System.out.println("===Book Management Program (CRUD)===");
        System.out.println("1. New book");
        System.out.println("2. Find a book(ISBN)");
        System.out.println("3. Update a book");
        System.out.println("4. Delete a book");
        System.out.println("5. Print the book list");
        System.out.println("0. Exit");
    }

    public static void checkAndCreateFile(String filePath) {
        File file = new File(filePath);
        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("Create file in: " + file.getAbsolutePath());
            } catch (IOException e) {
                System.out.println("Create file fail: " + e.getMessage());
            }
        } else {
            System.out.println("File already exist in: " + file.getAbsolutePath());
        }
    }

    public static List<Book> getBookList(String filePath) {

        List<Book> bookList = new ArrayList<>();
        try (
                FileInputStream fileInputStream = new FileInputStream(filePath);
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        ) {
            String dataLine = bufferedReader.readLine();
            while (dataLine != null) {
                String[] bookData = dataLine.split(";");
                String isbn = bookData[0];
                String title = bookData[1];
                String author = bookData[2];
                int year = Integer.parseInt(bookData[3]);
                Book book = new Book(isbn, title, author, year);
                bookList.add(book);
                dataLine = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("[ERR] File not found!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bookList;
    }

    public static void saveBookList(List<Book> listBook, String filePath) {

        try (
                FileOutputStream fileOutputStream = new FileOutputStream(filePath);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
                BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        ) {
            for (Book book : listBook) {
                String dataLine = book.getIsbn() + ";" + book.getTitle() + ";" + book.getAuthor() + ";" + book.getYear();
                bufferedWriter.write(dataLine);
                bufferedWriter.newLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("[ERR] File not found!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean isBookExistInList(List<Book> bookList, String isbn) {

        if (bookList.size() == 0) {
            return false;
        }

        for (Book book : bookList) {
            if (book.getIsbn().equalsIgnoreCase(isbn)) {
                return true;
            }
        }
        return false;
    }

    public static List<Book> addNewBook(Book newBook, String filePath) {

        if (isBookExistInList(getBookList(filePath), newBook.getIsbn())) {
            throw new RuntimeException("Book exist in list!!");
        }

        List<Book> newListBooksAdded = new ArrayList<>();
        newListBooksAdded.add(newBook);
        newListBooksAdded.addAll(getBookList(filePath));
        return newListBooksAdded;
    }

    public static void findBook(String isbn, String filePath) {

        if (!isBookExistInList(getBookList(filePath), isbn)) {
            System.out.printf("Book with ISBN %s is not found\n",isbn);
        } else {
            int indexBook = 0;
            while (indexBook < getBookList(filePath).size()){

                if (getBookList(filePath).get(indexBook).getIsbn().equalsIgnoreCase(isbn)) {
                    break;
                }
                indexBook++;
            }

            Book bookFound = getBookList(filePath).get(indexBook);
            System.out.println("ISBN: "+bookFound.getIsbn());
            System.out.println("Title: "+bookFound.getTitle());
            System.out.println("Author: "+bookFound.getAuthor());
            System.out.println("Year: "+bookFound.getYear());
        }
    }

    public static List<Book> updateBook(Book updatebook, String filePath) {

        List<Book> newListBookUpdated = new ArrayList<>(getBookList(filePath));

        for (int indexToUpdate = 0; indexToUpdate < getBookList(filePath).size(); indexToUpdate++) {

            if (getBookList(filePath).get(indexToUpdate).getIsbn().equalsIgnoreCase(updatebook.getIsbn())) {
                newListBookUpdated.set(indexToUpdate, updatebook);
                break;
            }
        }
        return newListBookUpdated;
    }

    public static List<Book> deleteBook(String isbn, String filePath) {

        List<Book> newListBookDeleted = new ArrayList<>(getBookList(filePath));

        for (int indexToDeleted = 0; indexToDeleted < getBookList(filePath).size(); indexToDeleted++) {

            if (getBookList(filePath).get(indexToDeleted).getIsbn().equalsIgnoreCase(isbn)) {
                newListBookDeleted.remove(indexToDeleted);
                System.out.printf("Book with ISBN<%s> is deleted successfully\n", isbn);
                break;
            }
        }
        return newListBookDeleted;
    }
}
