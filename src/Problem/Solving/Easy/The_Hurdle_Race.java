package Problem.Solving.Easy;

import java.util.Scanner;

public class The_Hurdle_Race {
    private static final Scanner scanner = new Scanner(System.in);

    static int hurdleRace(int k, int[] height) {
        int highest = 0;
        for (int i = 0; i < height.length; i++) {
            if (height[i] > highest) highest = height[i];
        }
        int result = 0;
        if (highest > k) result = highest - k;
        return result;
    }

    public static void main(String[] args) {

        String[] nk = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);
        int[] height = new int[n];

        String[] heightItems = scanner.nextLine().split(" ");

        for (int i = 0; i < n; i++) {
            int heightItem = Integer.parseInt(heightItems[i]);
            height[i] = heightItem;
        }
        int result = hurdleRace(k, height);
        System.out.println(result);
    }
}
