package Problem.Solving.Easy;

import java.util.Scanner;

public class Day_of_the_Programmer {
    static String dayOfProgrammer(int year) {
        // Gregorian
        if (year >= 1919) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) return "12.09." + year;
            else return "13.09." + year;
        }
        // Julian
        if (year < 1918) {
            if (year % 4 == 0) return "12.09." + year;
            else return "13.09." + year;
        }
        return "26.09.1918";
    }

    public static void main(String[] args) {
        int year = new Scanner(System.in).nextInt();
        String result = dayOfProgrammer(year);
        System.out.println(result);
    }

}


