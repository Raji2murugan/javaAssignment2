package javaAssignment2;

import java.util.Scanner;
/**
 * 2. Create a program that takes a student's score as input and outputs their corresponding grade.
 */

public class StudentGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter the student's score: ");
		        int score = scanner.nextInt();

		        char grade;
		        if (score >= 90) {
		            grade = 'A';
		        } else if (score >= 80) {
		            grade = 'B';
		        } else if (score >= 70) {
		            grade = 'C';
		        } else if (score >= 60) {
		            grade = 'D';
		        } else {
		            grade = 'F';
		        }

		        System.out.println("The student's grade is: " + grade);

		   

}

}