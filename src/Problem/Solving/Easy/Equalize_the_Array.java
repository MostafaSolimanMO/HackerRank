package Problem.Solving.Easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Equalize_the_Array {

    private static final Scanner scanner = new Scanner(System.in);

    static int equalizeArray(int[] arr) {
        int len = arr.length;
        ArrayList arrayList = new ArrayList();

        for (int i = 0; i < len; i++) {
            int repetition = 0;
            for (int j = 0; j < len; j++) {
                if (arr[i] != arr[j]) repetition++;
            }
            arrayList.add(repetition);
        }
        Collections.sort(arrayList);
        return (int) arrayList.get(1);
    }

    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int[] arr = new int[n];
        String[] arrItems = scanner.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }
        int result = equalizeArray(arr);
        System.out.println(result);
        scanner.close();
    }
}
