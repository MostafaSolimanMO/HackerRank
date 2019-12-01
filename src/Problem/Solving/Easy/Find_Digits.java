package Problem.Solving.Easy;

import java.util.Scanner;

public class Find_Digits {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int result = 0;
        String nString = String.valueOf(n);
        for (int i = 0; i < nString.length(); i++) {
            int x = Integer.parseInt(String.valueOf(nString.charAt(i)));
            if (x != 0 && n % x == 0) {
                result++;
            }
        }
        System.out.println(result);
    }
}
