package DaysOfCode;

import java.util.Scanner;

public class Day6_LetsReview {
    public static void main(String[] args) {
        String text = new Scanner(System.in).nextLine();
        for (int i = 0; i < text.length(); i++) {
            if (i % 2 == 0) {
                System.out.print(text.charAt(i));
            }
        }
        System.out.print(" ");
        for (int i = 0; i < text.length(); i++) {
            if (i % 2 != 0) {
                System.out.print(text.charAt(i));
            }
        }
    }
}
