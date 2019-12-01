package Problem.Solving.Easy;

import java.util.Scanner;

class Grading_Students {
    private static final Scanner scanner = new Scanner(System.in);

    public static int[] gradingStudents(int[] grades) {
        // Write your code here
        for (int i = 0; i < grades.length; i++) {
            int next = ((grades[i] + 4) / 5) * 5;
            if (grades[i] < 38) {
                grades[i] = grades[i];
            } else if (next - grades[i] < 3) {
                grades[i] = next;
            }
        }
        return grades;
    }

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0, length = arr.length; i < length; i++) {
            arr[i] = scanner.nextInt();
        }
        arr = gradingStudents(arr);
        for (int i = 0, length = arr.length; i < length; i++) {
            System.out.println(arr[i]);
        }
    }
}
