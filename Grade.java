package InternDEV;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Map<String, Double>> studentGrades = new HashMap<>();

        int numStudents, numAssignments;
        System.out.print("Enter the number of students: ");
        numStudents = sc.nextInt();
        System.out.print("Enter the number of assignments: ");
        numAssignments = sc.nextInt();

        for (int i = 0; i < numStudents; i++) {
            System.out.print("\nEnter the name of student " + (i + 1) + ": ");
            String studentName = sc.next();
            studentGrades.put(studentName, new HashMap<>());

            for (int j = 0; j < numAssignments; j++) {
                System.out.print("Enter the score for assignment " + (j + 1) + ": ");
                double score = sc.nextDouble();
                studentGrades.get(studentName).put("Assignment " + (j + 1), score);
            }
        }

        // Calculate and display summary for each student
        System.out.println("\nSummary of Student Grades:");
        for (String studentName : studentGrades.keySet()) {
            Map<String, Double> studentScores = studentGrades.get(studentName);
            double totalScore = 0;
            int numScores = studentScores.size();

            System.out.println("\n" + studentName + "'s Grades:");
            for (String assignment : studentScores.keySet()) {
                double score = studentScores.get(assignment);
                totalScore += score;
                System.out.println(assignment + ": " + score);
            }

            double average = totalScore / numScores;
            System.out.println("Overall Grade: " + totalScore + " / " + numScores + " = " + average);
        }

        sc.close();
    }
}

