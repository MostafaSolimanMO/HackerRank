package Problem.Solving.Easy;

import java.util.List;

public class Birthday_Chocolate {
    static int birthday(List<Integer> s, int d, int m) {
        int result = 0;
        for (int i = 0; i < s.size() - m + 1; i++) {
            int sum = 0;
            for (int j = i; j <= i + m - 1; j++) {
                sum = sum + s.get(j);
            }
            if (sum == d) result++;
        }
        return result;
    }
}
