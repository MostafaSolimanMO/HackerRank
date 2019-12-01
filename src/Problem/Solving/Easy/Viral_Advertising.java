package Problem.Solving.Easy;

import java.util.Scanner;

public class Viral_Advertising {
    public static void main(String[] args) {
        int Days = new Scanner(System.in).nextInt();
        int Shared = 5;
        int Likes = Shared/2;
        int Cumulative = 2;
        for (int i = 1; i < Days; i++){
            Shared = Likes * 3;
            Likes = Shared/2;
            Cumulative = Cumulative + Likes;
        }
        System.out.println(Cumulative);
    }
}
