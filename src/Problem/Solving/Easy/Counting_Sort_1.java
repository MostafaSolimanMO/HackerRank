package Problem.Solving.Easy;

import java.util.Scanner;

public class Counting_Sort_1 {
    // Complete the countingSort function below.
    static int[] countingSort(int[] arr) {
        int n = arr.length;
        int count[] = new int[100];
        for (int i = 0; i < 100; i++)
            count[i] = 0;
        for (int i = 0; i < n; i++)
            count[arr[i]]++;
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int[] result = countingSort(arr);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);

            if (i != result.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
        scanner.close();
    }
}
