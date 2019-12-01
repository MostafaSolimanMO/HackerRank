package Problem.Solving.Easy;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class Birthday_Cake_Candles {

    private static final Scanner scanner = new Scanner(System.in);

    static int birthdayCakeCandles(int[] ar) {
        int tallest = 1;
        Arrays.sort(ar);
        for (int i = ar.length - 1; i > 0; i--) {
            if (ar[i] == ar[i - 1]) {
                tallest++;
            }
        }
        return tallest;
    }

    public static void main(String[] args) throws IOException {

        int arCount = scanner.nextInt();
        int[] ar = new int[arCount];


        for (int i = 0; i < arCount; i++) {
            int arItem = scanner.nextInt();
            ar[i] = arItem;
        }

        int result = birthdayCakeCandles(ar);
        System.out.println(result);
        scanner.close();
    }
}

