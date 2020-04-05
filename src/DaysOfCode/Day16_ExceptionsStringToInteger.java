package DaysOfCode;

import java.util.Scanner;

public class Day16_ExceptionsStringToInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        try {
            int res = Integer.valueOf(S);
            System.out.println(res);
        } catch (NumberFormatException e) {
            System.out.println("Bad String");
        }
    }
}
