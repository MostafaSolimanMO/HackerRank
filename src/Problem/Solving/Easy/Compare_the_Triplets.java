package Problem.Solving.Easy;

import java.util.Scanner;

public class Compare_the_Triplets {
    static int resA(int[] bob, int[] ali, int n) {
        int pointBob = 0;
        int pointAli = 0;
        int bobP;
        int aliP;
        for (int i = 0; i < n; i++) {
            bobP = bob[i];
            aliP = ali[i];
            if (bobP > aliP) {
                pointBob = pointBob + 1;
            }
            if (aliP > bobP) {
                pointAli = pointAli + 1;
            }
        }
        return pointAli;
    }

    static int resB(int[] bob, int[] ali, int n) {
        int pointBob = 0;
        int pointAli = 0;
        int bobP;
        int aliP;
        for (int i = 0; i < n; i++) {
            bobP = bob[i];
            aliP = ali[i];
            if (bobP > aliP) {
                pointBob = pointBob + 1;
            }
            if (aliP > bobP) {
                pointAli = pointAli + 1;
            }
        }
        return pointBob;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = 3;
        int a[] = new int[t];
        int b[] = new int[t];
        for (int j = 0; j < 3; j++) {
            a[j] = in.nextInt();
        }
        for (int j = 0; j < t; j++) {
            b[j] = in.nextInt();
        }
        System.out.print(resB(a, b, t) + "," + resA(a, b, t));


    }
}
