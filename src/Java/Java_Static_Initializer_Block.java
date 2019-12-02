package Java;

import java.util.Scanner;

public class Java_Static_Initializer_Block {
    private static final Scanner scanner = new Scanner(System.in);
    private static final int B = scanner.nextInt();
    private static final int H = scanner.nextInt();
    private static Boolean flag = false;

    static {
        if (B > 0 && H > 0) {
            flag = true;
        } else System.out.println("java.lang.Exception: Breadth and height must be positive");
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }
    }

}


