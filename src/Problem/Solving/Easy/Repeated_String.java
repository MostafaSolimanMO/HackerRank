package Problem.Solving.Easy;

import java.util.Scanner;

public class Repeated_String {
    private static final Scanner scanner = new Scanner(System.in);

    static long repeatedString(String s, long n) {
        if (s.length() == 1 && s.charAt(0) == 'a') return n;
        long result = 0;
        long count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') count++;
        }

        long divisor = n / s.length();
        result = result + divisor * count;

        long remainder = n % s.length();
        for (int i = 0; i < remainder; i++) {
            if (s.charAt(i) == 'a') result++;
        }

        return result;

    }

    public static void main(String[] args) {

        String s = scanner.nextLine();
        long n = scanner.nextLong();
        long result = repeatedString(s, n);
        System.out.println(result);
        scanner.close();
    }
}
