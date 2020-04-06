package Problem.Solving.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class Priyanka_and_Toys {

    private static final Scanner scanner = new Scanner(System.in);

    static int toys(int[] w) {
        int cont = 0, x = -1;
        Arrays.sort(w);
        for (int i = 0; i < w.length; i++)
            if (w[i] > x) {
                x = w[i] + 4;
                cont++;
            }
        return cont;
    }

    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int[] w = new int[n];
        String[] wItems = scanner.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            int wItem = Integer.parseInt(wItems[i]);
            w[i] = wItem;
        }
        int result = toys(w);
        System.out.println(result);

    }
}
