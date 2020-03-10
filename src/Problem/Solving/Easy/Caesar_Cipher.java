package Problem.Solving.Easy;

import java.util.Scanner;

public class Caesar_Cipher {
    private static final Scanner scanner = new Scanner(System.in);

    static String caesarCipher(String s, int k) {
        char[] sArr = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                char ch = (char) (((int) s.charAt(i) + k - 65) % 26 + 65);
                sArr[i] = ch;
            } else if (Character.isLowerCase(s.charAt(i))) {
                char ch = (char) (((int) s.charAt(i) + k - 97) % 26 + 97);
                sArr[i] = ch;
            }
        }
        return new String(sArr);
    }

    public static void main(String[] args) {
        String s = scanner.nextLine();
        int k = scanner.nextInt();
        String result = caesarCipher(s, k);
        System.out.println(result);
    }

}
