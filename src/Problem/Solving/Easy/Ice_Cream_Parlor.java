package Problem.Solving.Easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ice_Cream_Parlor {

    static int[] icecreamParlor(int m, int[] arr) {
        int[] res = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(m - arr[i])) {
                res[0] = map.get(m - arr[i]);
                res[1] = i + 1;
                return res;
            }
            map.put(arr[i], i + 1);
        }
        return res;
    }

    public static void main(String[] args) {

        int t = new Scanner(System.in).nextInt();

        for (int tItr = 0; tItr < t; tItr++) {
            int m = new Scanner(System.in).nextInt();
            int n = new Scanner(System.in).nextInt();
            int[] arr = new int[n];
            String[] arrItems = new Scanner(System.in).nextLine().split(" ");

            for (int i = 0; i < n; i++) {
                int arrItem = Integer.parseInt(arrItems[i]);
                arr[i] = arrItem;
            }

            int[] result = icecreamParlor(m, arr);

            for (int i = 0; i < result.length; i++) {
                System.out.print(result);

                if (i != result.length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
