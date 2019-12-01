package Problem.Solving.Easy;

public class Apple_And_Orange {

    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int manyApples = 0;
        int manyOrange = 0;
        for (int i = 0; i < apples.length; i++) {
            int x = a + (apples[i]);
            if (x >= s && x <= t) manyApples++;
        }
        for (int i = 0; i < oranges.length; i++) {
            int x = b + (oranges[i]);
            if (x >= s && x <= t) manyOrange++;
        }
        System.out.println(manyApples);
        System.out.println(manyOrange);

    }

    public static void main(String[] args) {
        int[] x = new int[]{-2};
        int[] y = new int[]{5};
        countApplesAndOranges(2, 3, 1, 5, x, y);
    }
}
