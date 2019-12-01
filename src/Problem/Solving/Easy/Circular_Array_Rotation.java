package Problem.Solving.Easy;

public class Circular_Array_Rotation {
    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        for (int j = 0; j < k; j++) {
            int temp = a[0];
            for (int i = 0; i < k - 1; i++) {
                a[i] = a[i + 1];
                a[i] = temp;
            }
        }
        for (int i = 0; i < queries.length; i++) {
            queries[i] = a[i];
        }
        return queries;
    }
}
