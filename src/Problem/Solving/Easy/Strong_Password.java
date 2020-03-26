package Problem.Solving.Easy;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Strong_Password {
    private static final Scanner scanner = new Scanner(System.in);

    static int minimumNumber(int n, String password) {
        int res = 0;
        Pattern special = Pattern.compile("(\\\\W)");
        Pattern numbers = Pattern.compile("[0123456789]");
        Pattern lower_case = Pattern.compile("[abcdefghijklmnopqrstuvwxyz]");
        Pattern upper_case = Pattern.compile("[ABCDEFGHIJKLMNOPQRSTUVWXYZ]");
        Matcher hasSpecial = special.matcher(password);
        Matcher hasNumbers = numbers.matcher(password);
        Matcher hasLower_case = lower_case.matcher(password);
        Matcher hasUpper_case = upper_case.matcher(password);
        if (!hasSpecial.find()) res++;
        if (!hasNumbers.find()) res++;
        if (!hasLower_case.find()) res++;
        if (!hasUpper_case.find()) res++;
        if (res + n < 6) res = res + 6 - (res + n);
        return res;
    }

    public static void main(String[] args) {

        int n = new Scanner(System.in).nextInt();
        String password = scanner.nextLine();
        int answer = minimumNumber(n, password);
        System.out.println(answer);
        scanner.close();
    }
}
