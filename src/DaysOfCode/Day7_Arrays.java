package DaysOfCode;

import java.util.Scanner;

public class Day7_Arrays {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Scanner(System.in).nextInt();
        }
        for (int j = n - 1; j > -1; j--) {
            System.out.print(arr[j] + " ");
        }
    }
}
