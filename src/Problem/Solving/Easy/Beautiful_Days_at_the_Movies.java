package Problem.Solving.Easy;

import java.util.Scanner;

public class Beautiful_Days_at_the_Movies {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        int j = input.nextInt();
        int k = input.nextInt();

        int result = 0;

        for (int x = i; x <= j; x++) {
            StringBuilder day = new StringBuilder(String.valueOf(x));
            int xReverse = Integer.parseInt(day.reverse().toString());

            if (Math.abs(x - xReverse) % k == 0) {
                result++;
            }
        }
        System.out.println(result);
    }
}
