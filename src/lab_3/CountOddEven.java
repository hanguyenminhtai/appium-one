package lab_3;

public class CountOddEven {

    public static void main(String[] args) {
        int evenCount = 0;
        int oddCount = 0;
        int[] intArr = {1, 2, 3, 4, 5};
        int n = intArr.length;

        for (int i = 0; i < n; i++) {
            if (intArr[i] % 2 == 0) {
                evenCount = evenCount + 1;
            } else {
                oddCount = oddCount + 1;
            }
        }
        System.out.println("Numb of Even:" + evenCount
                + "\nNumb of Odd:" + oddCount);
    }
}
