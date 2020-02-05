package Problem.Solving.Easy;

import java.util.Scanner;

public class Jumping_on_the_Clouds_Revisited {
    private static final Scanner scanner = new Scanner(System.in);

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c, int k) {
        int result = 100;
        int i = 0;
        do {
            i = (i + k) % c.length;
            result -= c[i] * 2 + 1;
        } while (i != 0);
        return result;
    }

    public static void main(String[] args) {

        String[] nk = new Scanner(System.in).nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] c = new int[n];

        String[] cItems = new Scanner(System.in).nextLine().split(" ");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c, k);
        System.out.println(result);
        scanner.close();
    }
}
