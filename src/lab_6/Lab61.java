package lab_6;

public class Lab61 {
    public static void main(String[] args) {
        String myString = "2hrs and 5minutes";

        String[] strSpilit = myString.split(" and ");
        String hString = strSpilit[0].substring(0, 1);
        String mString = strSpilit[1].substring(0, 1);
        int hString1 = Integer.valueOf(hString);
        int mString1 = Integer.valueOf(mString);
        System.out.println("Total minutes: " + (hString1 * 60 + mString1));
    }
}
