package Problem.Solving.Easy;

import java.util.Scanner;

public class Diagonal_Difference {
    static int res(int[][] arr, int n) {
        int diagonal1 = 0;
        for (int i = 0; i < n; i++) {
            diagonal1 = arr[i][i] + diagonal1;
        }
        int diagonal2 = 0;
        for (int i = n - 1, j = -1; i >= 0; i--) {
            j++;
            diagonal2 = arr[i][j] + diagonal2;
        }
        return Math.abs(diagonal1 - diagonal2);

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int a[][] = new int[t][t];
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < t; j++) {
                a[i][j] = in.nextInt();
            }
        }
        System.out.println(res(a, t));
    }
}
