package Codsoft;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int n = sc.nextInt();

        int[] mark_arr = new int[n];
        boolean validMarks = false;

        while (!validMarks) {
            validMarks = true; // Assume all marks will be valid in this iteration

            for (int i = 0; i < n; i++) {
                System.out.print("Enter marks for subject " + (i+1) + ": ");
                int mark = sc.nextInt();

                if (mark > 100) {
                    System.out.println("Invalid mark. Marks cannot be more than 100. Please start again.");
                    validMarks = false;
                    break;
                } else {
                    mark_arr[i] = mark;
                }
            }
        }
        // Totall
        int Total=0;
        for(int t : mark_arr){
            Total+=t;
        }
        //Percentage
        int percentage=Total/n;

        //Grade
        char grade;

        if (percentage >= 90 && percentage <= 100) {
            grade = 'A';
        } else if (percentage<=90 && percentage >= 80) {
            grade = 'B';
        } else if (percentage<=80 && percentage >= 70) {
            grade = 'C';
        } else if (percentage>=60 && percentage >= 50 ) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Display
       System.out.println("===Your marks , percentage, and grade are===");
        for (int i = 0; i < n; i++) {
            System.out.println("Subject " + (i+1) + ": " + mark_arr[i]);
        }
        System.out.println("Total Mark : "+Total);
        System.out.println("Average  percentage : "+ percentage);
        System.out.println("Grade : "+ grade);

        sc.close();
    }
}
