package DaysOfCode;

import java.util.Scanner;

public class Day19_Interfaces {
    interface AdvancedArithmetic {
        int divisorSun(int n);
    }

    static class Calculator implements AdvancedArithmetic {
        @Override
        public int divisorSun(int n) {
            int result = 0;
            for (int i = 1; i <= n; i++)
                if (n % i == 0) result = result + i;
            return result;
        }
    }

    static class Solution {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            scan.close();

            AdvancedArithmetic myCalculator = new Calculator();
            int sum = myCalculator.divisorSun(n);
            System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName());
            System.out.println(sum);
        }
    }
}
