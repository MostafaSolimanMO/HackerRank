package Problem.Solving.Easy;

import java.util.Scanner;

public class Beautiful_Binary_String {
    private static final Scanner scanner = new Scanner(System.in);

    static int beautifulBinaryString(String b) {
        return (b.length() - b.replaceAll("010", "").length()) / 3;
    }

    public static void main(String[] args) {
        String b = scanner.nextLine();
        int result = beautifulBinaryString(b);
        System.out.println(result);
    }
}
