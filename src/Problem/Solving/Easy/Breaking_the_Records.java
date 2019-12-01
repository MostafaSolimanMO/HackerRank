package Problem.Solving.Easy;

import java.util.Scanner;

public class Breaking_the_Records {
    private static final Scanner scanner = new Scanner(System.in);

    static int[] breakingRecords(int[] scores) {
        int min = 0;
        int max = 0;
        int lowest = scores[0];
        int tallest = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < lowest) {
                lowest = scores[i];
                min++;
            }
            if (scores[i] > tallest) {
                tallest = scores[i];
                max++;
            }
        }
        return new int[]{max, min};
    }

    public static void main(String[] args) {

        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0, length = arr.length; i < length; i++) {
            arr[i] = scanner.nextInt();
        }
        arr = breakingRecords(arr);
        for (int i = 0, length = arr.length; i < length; i++) {
            System.out.println(arr[i]);
        }
    }
}
