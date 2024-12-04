package Assignment;

import java.util.Scanner;

public class Grades20 {
    static String[] weeks;
    static String[] students;
    static int[][] grade;

    public static void inputNumberOfWeeksAndStudents() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of weeks: ");
        int numberOfWeeks = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine();

        weeks = new String[numberOfWeeks];
        students = new String[numberOfStudents];
        grade = new int[numberOfWeeks][numberOfStudents];

        for (int i = 0; i < numberOfWeeks; i++) {
            weeks[i] = "Week " + (i + 1);
        }

        System.out.println("Enter student names:");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            students[i] = scanner.nextLine();
        }
    }

    public static void inputgradeData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter grade data:");

        for (int i = 0; i < weeks.length; i++) {
            System.out.println("Day: " + weeks[i]);
            for (int j = 0; j < students.length; j++) {
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

        for (int i = 0; i < weeks.length; i++) {
            System.out.printf("%-10s", weeks[i]);
            for (int j = 0; j < students.length; j++) {
                System.out.printf("%-10d", grade[i][j]);
            }
            System.out.println();
        }
    }

    public static void findBestgradeWeek() {
        int maxgrade = 0;
        int bestDayIndex = 0;

        for (int i = 0; i < weeks.length; i++) {
            int dailyTotal = 0;
            for (int j = 0; j < students.length; j++) {
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
    for (int i = 0; i < weeks.length; i++) {
        int maxstudentgrade = 0;
        int bestGradeIndex = 0;
        for (int j = 0; j < students.length; j++) {
            if (grade[i][j] > maxstudentgrade) {
                maxstudentgrade = grade[i][j];
                bestGradeIndex = j;
            }
        }
        System.out.print(weeks[i] + " - Grades: ");
        for (int j = 0; j < students.length; j++) {
            System.out.print(students[j] + ": " + grade[i][j] + "  ");
        }
        System.out.println("\nBest grade: " + students[bestGradeIndex] + " (" + maxstudentgrade + ")");
        }
    }

    public static void main(String[] args) {
        inputNumberOfWeeksAndStudents();
        inputgradeData();
        displayAllgradeData();
        findBestgradeWeek();
        findBestGradeEachWeek();
    }
}
