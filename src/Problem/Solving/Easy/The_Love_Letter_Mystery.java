package Problem.Solving.Easy;

import java.util.Scanner;

public class The_Love_Letter_Mystery {
    private static final Scanner scanner = new Scanner(System.in);

    static int theLoveLetterMystery(String s) {
        int sum = 0;
        for (int i = 0, j = s.length() - 1; i < j; i++, j--)
            sum += Math.abs(s.charAt(i) - s.charAt(j));
        return sum;
    }

    public static void main(String[] args) {

        int q = scanner.nextInt();

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = theLoveLetterMystery(s);

            System.out.println(result);
        }
    }
}
