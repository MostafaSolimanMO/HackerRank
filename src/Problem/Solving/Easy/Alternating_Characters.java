package Problem.Solving.Easy;

import java.util.Scanner;

public class Alternating_Characters {
    private static final Scanner scanner = new Scanner(System.in);

    static int alternatingCharacters(String s) {
        int res = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) res++;
        }
        return res;
    }

    public static void main(String[] args) {
        int q = new Scanner(System.in).nextInt();
        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();
            int result = alternatingCharacters(s);
            System.out.println(result);
        }
    }
}
