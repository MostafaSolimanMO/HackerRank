package Problem.Solving.Easy;

import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();
        int result = 1;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) result++;
        }
        System.out.print(result);
    }
}
