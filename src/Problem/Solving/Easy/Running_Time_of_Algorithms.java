package Problem.Solving.Easy;

import java.util.Scanner;

public class Running_Time_of_Algorithms {
    private static final Scanner scanner = new Scanner(System.in);

    static int runningTime(int[] arr) {
        int total = 0;
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
                total++;
            }
            arr[j + 1] = key;
        }

        return total;
    }

    public static void main(String[] args) {

        int n = scanner.nextInt();

        int[] arr = new int[n];

        String[] arrItems = new Scanner(System.in).nextLine().split(" ");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = runningTime(arr);
        System.out.println(result);
    }
}
