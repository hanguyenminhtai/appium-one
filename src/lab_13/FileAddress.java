package lab_13;

public interface FileAddress {
    String relativePath = "/src/lab_13/BookDB.txt";
    String absolutePath = System.getProperty("user.dir").concat(relativePath);
}
