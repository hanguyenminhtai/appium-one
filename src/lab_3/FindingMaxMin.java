package lab_3;

public class FindingMaxMin {

    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};
        int Min = intArr[0];
        int Max = intArr[0];
        int n = intArr.length;

        for (int i = 0; i < n; i++) {
            if (intArr[i] > Max) {
                Max = intArr[i];
            } else if (intArr[i] < Min) {
                Min = intArr[i];
            }
        }

        System.out.println("Minimum is:" + Min);
        System.out.println("Maximum is:" + Max);
    }
}
