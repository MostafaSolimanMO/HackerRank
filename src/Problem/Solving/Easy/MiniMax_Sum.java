package Problem.Solving.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class MiniMax_Sum {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        Arrays.sort(arr);
        long min = 0;
        long max = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            min = min + arr[i];
        }
        for (int i = 1; i < arr.length; i++) {
            max = max + arr[i];
        }
        System.out.print(min + " " + max);

    }

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}

