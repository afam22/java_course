package chapter4;


import java.util.Scanner;

/*
 * NESTED LOOPS
 * Find the average test scores for each student in the class.
 * There are 24 students and 4 tests.
 */
public class AverageTestScores {
    public static void main(String[] args) {
        int noOfStudents = 24;
        int noOfTests = 4;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < noOfStudents; i++){
            double total = 0;       //accumulation variable initialized at zero for adding tests scores
            for (int j = 0; j< noOfTests; j++){
                System.out.println("Enter the scores for Test #" + (j+1));
                double score = scanner.nextDouble();
                total = total + score;

            }
            double average = total/noOfTests;
            System.out.println("Test average score for student #" + (i+1) + " is " + average);
        }

        scanner.close();
    }
}
