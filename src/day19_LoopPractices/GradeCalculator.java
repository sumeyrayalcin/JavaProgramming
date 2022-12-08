package day19_LoopPractices;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean flag = true;
        while(flag) {
            System.out.println("Enter your score");
            int score = scan.nextInt();
            if (score < 0 || score > 100) {
                System.err.println("Invalid Entry");
                System.exit(0);
            }
            if (score >= 90) {
                System.out.println("A");
            } else if (score >= 80) {
                System.out.println("B");
            } else if (score >= 70) {
                System.out.println("C");
            } else if (score >= 60) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }
            System.out.println("would you like to continue");
            String ans = scan.next().toLowerCase();

            while (!(ans.equals("yes") || ans.equals("no")) ){
                System.err.println("Invalid Entry, please write again");
                ans = scan.next();
            }
            if ( ans.equals("no")){
                System.out.println("Thank you");
                flag = false;
            }

        }
        scan.close();
    }

}
/*
 Write a program for grade calculator:
1. Ask the user "Enter your score"
If user enters invalid score, terminate
the program after displaying the error message "Invalid Entry"
 2. Display the grade of the student.
 90 ~ 100 ==> A
 80 ~ 89 ==> B
 70 ~ 79 ==> C
 60 ~ 69 ==> D
 0 ~ 59 ==> F
2. Ask the user would you like to continue
If "yes" --> repeat the previous steps
If "no" --> print "Thank you for using
Cydeo Grade Calculator APP"
If user enters an invalid entry,
terminate the program after displaying the error message "Invalid Entry"
 */