package Problem.Solving.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class Sock_Merchant {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        int total = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                total++;
                i++;
            }
        }
        System.out.println(total);
    }
}
