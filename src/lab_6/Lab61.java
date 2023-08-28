package lab_6;

public class Lab61 {
    public static void main(String[] args) {

        String myString = "2hrs and 5minutes";
        String hString = myString.substring(0, 1);
        String mString = myString.substring(9, 10);
        int hString1 = Integer.valueOf(hString);
        int mString1 = Integer.valueOf(mString);
        System.out.println("Total minutes: " + (hString1 * 60 + mString1));
    }
}
