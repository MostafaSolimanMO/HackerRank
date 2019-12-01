package Problem.Solving.Easy;

import java.util.*;

public class Closest_Numbers {


    static void closestNumbers(int[] arr) {
        Arrays.sort(arr);
        int smallestDiff = arr[arr.length - 1] - arr[arr.length - 2];
        for (int i = arr.length - 1; i > 0; i--) {
            int x = arr[i] - arr[i - 1];
            if (x < smallestDiff) smallestDiff = x;
        }
        List<Integer> num = new ArrayList<>();
        for (int i = arr.length - 1; i > 0; i--) {
            int x = arr[i] - arr[i - 1];
            if (x == smallestDiff) {
                num.add(arr[i]);
                num.add(arr[i - 1]);
            }
        }
        Collections.sort(num);
        for (Integer counter : num) {
            System.out.print(counter + " ");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = input.nextInt();


        closestNumbers(array);

    }
}

