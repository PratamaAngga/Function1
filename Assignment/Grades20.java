package Assignment;

import java.util.Scanner;

public class Grades20 {
    static String[] weeks = {"Week 1", "Week 2", "Week 3", "Week 4", "Week 5", "Week 6", "Week 7"};
    static String[] students = {"Sari", "Rina", "Yani", "Dwi", "Lusi"};
    static int[][] grade = new int[7][5];

    public static void inputgradeData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter grade data:");

        for (int i = 0; i < 7; i++) {
            System.out.println("Day: " + weeks[i]);
            for (int j = 0; j < 5; j++) {
                System.out.print("  " + students[j] + ": ");
                grade[i][j] = scanner.nextInt();
            }
        }
    }

    public static void displayAllgradeData() {
        System.out.println("\ngrade Data:");
        System.out.printf("%-10s", "WEEK");
        for (int i = 0; i < students.length; i++) {
            System.out.printf("%-10s", students[i]);
        }
        System.out.println();

        for (int i = 0; i < 7; i++) {
            System.out.printf("%-10s", weeks[i]);
            for (int j = 0; j < 5; j++) {
                System.out.printf("%-10d", grade[i][j]);
            }
            System.out.println();
        }
    }

    public static void findBestgradeWeek() {
        int maxgrade = 0;
        int bestDayIndex = 0;

        for (int i = 0; i < 7; i++) {
            int dailyTotal = 0;
            for (int j = 0; j < 5; j++) {
                dailyTotal += grade[i][j];
            }
            if (dailyTotal > maxgrade) {
                maxgrade = dailyTotal;
                bestDayIndex = i;
            }
        }
        System.out.println("\nThe week with the biggest number of grade is: " + weeks[bestDayIndex] + " (" + maxgrade + " )");
    }

    public static void findBestGradeEachWeek() {
        System.out.println("\nBest-grade for each week (including all grades):");
    for (int i = 0; i < 7; i++) {
        int maxstudentgrade = 0;
        int bestGradeIndex = 0;
        for (int j = 0; j < 5; j++) {
            if (grade[i][j] > maxstudentgrade) {
                maxstudentgrade = grade[i][j];
                bestGradeIndex = j;
            }
        }
        System.out.print(weeks[i] + " - Grades: ");
        for (int j = 0; j < 5; j++) {
            System.out.print(students[j] + ": " + grade[i][j] + "  ");
        }
        System.out.println("\nBest grade: " + students[bestGradeIndex] + " (" + maxstudentgrade + ")");
        }
    }

    public static void main(String[] args) {
        inputgradeData();
        displayAllgradeData();
        findBestgradeWeek();
        findBestGradeEachWeek();
    }
}
