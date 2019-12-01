package Problem.Solving.Easy;

import java.util.Scanner;


public class Plus_Minus {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        double postive = 0;
        double negtive = 0;
        double zero = 0;
        double arrlenght = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                postive++;
            } else if (arr[i] < 0) {
                negtive++;
            } else zero++;
        }
        System.out.println(postive / arrlenght);
        System.out.println(negtive / arrlenght);
        System.out.println(zero / arrlenght);
    }

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
