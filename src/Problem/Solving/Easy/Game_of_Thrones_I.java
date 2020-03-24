package Problem.Solving.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class Game_of_Thrones_I {
    static String gameOfThrones(String s) {
        int odd = 0;
        char[] sArr = s.toCharArray();
        Arrays.sort(sArr);
        int query = 1;
        for (int i = 0; i < sArr.length - 1; i++) {
            if (odd > 2) return "NO";
            if (sArr[i] == sArr[i + 1]) query++;
            else {
                if (query % 2 != 0) odd++;
                query = 1;
            }
        }
        return "YES";
    }


    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        String result = gameOfThrones(s);
        System.out.println(result);
    }
}
