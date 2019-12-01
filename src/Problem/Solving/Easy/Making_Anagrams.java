package Problem.Solving.Easy;


import java.util.Scanner;

public class Making_Anagrams {
    private static final Scanner scan = new Scanner(System.in);

    static int makingAnagrams(String s1, String s2) {
        int count1[] = new int[26];
        int count2[] = new int[26];

        // count frequency of each character
        // in first string
        for (int i = 0; i < s1.length(); i++)
            count1[s1.charAt(i) - 'a']++;

        // count frequency of each character
        // in second string
        for (int i = 0; i < s2.length(); i++)
            count2[s2.charAt(i) - 'a']++;

        // traverse count arrays to find
        // number of characters to be removed
        int result = 0;
        for (int i = 0; i < 26; i++)
            result += Math.abs(count1[i] -
                    count2[i]);
        return result;
    }

    public static void main(String[] args) {
        String s1 = scan.nextLine();
        String s2 = scan.nextLine();
        int result = makingAnagrams(s1, s2);
        System.out.println(result);
    }
}
