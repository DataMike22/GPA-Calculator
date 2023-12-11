package GPACal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GPACalMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the best GPA Calculator");

        // Initialize variables
        int totalCredits = 0;
        double totalGradePts = 0.0;

        // List to store course details
        List<Course> courses = new ArrayList<>();

        // Prompt the user for the number of courses
        System.out.print("Enter the number of courses: ");
        int numCourses = scanner.nextInt();

        // Input course details and calculate GPA
        for (int i = 1; i <= numCourses; i++) {
            System.out.println("\nEnter details for Course " + i + ":");
            
            System.out.print("Course Code: ");  //Don't leave space in the course code
            String courseCode = scanner.next();
            
            scanner.nextLine();
            
            System.out.print("Course Units: ");
            int courseUnits = scanner.nextInt();

            System.out.print("Score: ");
            double score = scanner.nextDouble();

            // Calculate grade points
            double gradePts = calculateGradePoints(score);

            // Calculate total grade points and credits
            totalGradePts += gradePts * courseUnits;
            totalCredits += courseUnits;

            // Store course details in the list
            Course course = new Course(courseCode, courseUnits, score, gradePts);
            courses.add(course);
        }

        // Display the course details in a tabular form
        GPATable.printTable(courses);

        // Calculate GPA
        double gpa = totalGradePts / totalCredits;

        // Display GPA
        System.out.println("\nYour GPA is = " + String.format("%.2f", gpa) + " to 2 decimal places.");

        scanner.close();
    }

    private static double calculateGradePoints(double score) {
        // This is a simple mapping; you can modify this based on your grading system
        if (score >= 70) {
            return 5.0;
        } else if (score >= 60) {
            return 4.0;
        } else if (score >= 50) {
            return 3.0;
        } else if (score >= 45) {
            return 2.0;
        } else if (score >= 40){
            return 1.0;
        } else {
            return 0.0;
        }
    }
}