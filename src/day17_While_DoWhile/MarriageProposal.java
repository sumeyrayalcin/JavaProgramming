package day17_While_DoWhile;

import java.util.Scanner;

public class MarriageProposal {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


    /*    boolean flag1 = true;
        while(flag1) {
            System.out.println("Will you marry me (Yes/No)?");
            String answer = scan.next().toLowerCase();
            System.out.println("Your answer is " + answer);
            if (answer.equals("yes")) {
                System.out.println("Gongrats!");
                flag1 = false;
            } else if (answer.equals("no")) {
                System.out.println("Goodbye!");
                flag1 = false;
            } else {
                System.out.println("Invalid Answer, please re-enter");
            }
        }

*/
        System.out.println("Will you marry me? yes/no");
        String a = scan.next().toLowerCase();

        while (!(a.equals("yes")||a.equals("no"))){
            System.out.println("Invalid answer, please re-enter");
            a = scan.next().toLowerCase();
        }
        if (a.equals("yes")){
            System.out.println("congrats");
        }else {
            System.out.println("GoodBye");
        }
        scan.close();

    }
}
/*
 1. Write a program for the  marriage proposal program asking the user, "Will you marry me?"
     if the answer is yes, print "Congrats."
     if the answer is no, print "Goodbye"
     if the answer is neither yes nor no, print "Invalid answer, please re-enter" and repeat it until the user enters either yes or no
  */