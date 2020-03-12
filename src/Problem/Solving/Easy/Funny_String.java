package Problem.Solving.Easy;

import java.util.Scanner;

public class Funny_String {
    private static final Scanner scanner = new Scanner(System.in);

    static String funnyString(String s) {
        String funny = "Funny";
        String not = "Not Funny";
        char[] sChar = s.toCharArray();
        char[] sReverse = new StringBuilder(s).reverse().toString().toCharArray();
        for (int i = 0; i < s.length() - 1; i++) {
            if (Math.abs((int) sChar[i] - (int) sChar[i + 1]) != Math.abs((int) sReverse[i] - (int) sReverse[i + 1]))
                return not;
        }
        return funny;
    }

    public static void main(String[] args) {
        int q = new Scanner(System.in).nextInt();
        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();
            String result = funnyString(s);
            System.out.println(result);
        }
    }
}
