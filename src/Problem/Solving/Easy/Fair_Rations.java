package Problem.Solving.Easy;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Fair_Rations {

    public static final Scanner scanner = new Scanner(System.in);

    static int fairRations(int[] B) {
        int result = 0;
        for (int i = 0; i < B.length; i++) {
            if (B[i] % 2 != 0) {
                B[i] = B[i] + 1;
                result++;
                if (i + 1 < B.length) {
                    B[i + 1] = B[i + 1] + 1;
                    result++;
                } else {
                    B[i - 1] = B[i - 1] + 1;
                    result++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int N = scanner.nextInt();

        int[] B = new int[N];
        for (int i = 0; i < N; i++) {
            int BItem = scanner.nextInt();
            B[i] = BItem;
        }

        int sum = IntStream.of(B).sum();
        if (sum % 2 != 0) {
            System.out.println("NO");
        } else {
            int result = fairRations(B);
            System.out.println(result);
        }
    }
}
