package day18_NestedLoop;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


       while(true) {
           System.out.println("enter a number");
           int a = scan.nextInt();
           if (a % 2 == 0) {
               System.out.println(a + " is even number");
           } else {
               System.out.println(a + " is odd number");
           }
           System.out.println("Would you like to enter another number");

           String ans = scan.next().toLowerCase();  //no, NO,No nO

           while( !(ans.equals("yes") || ans.equals("no")) ){ // if the answer is invalid (not yes or no)
               System.err.println("Please re enter, Would you like to enter another number?");
               ans = scan.next().toLowerCase();
           }
           if(ans.equals("no")){
               break;
           }

       }

       scan.close();
    }
}
/*
2. Write a program that asks user to enter a numnber , and check if the number is odd or even.
        if it's odd, print "Odd Number"
        if it's even, print "Even number"
        Ask the user "Would you like to enter another number"
                if user enters yes, repeat the previous steps
                if user enters no, print nothing
                If user enters invalid answer, repeat the previous steps
 */