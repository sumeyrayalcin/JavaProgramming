package day12_Scanner;

import java.util.Scanner;

public class ConvertToDollars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter cents");
        int cents = input.nextInt();

        int result1 = cents/100;
        int result2 = + cents%100;

        System.out.println(cents + " cents equal to:"+ result1 + " dollars "+
                " and "+ result2 + " cents");

input.close();

    }
}

/*
Write a program that can convert cents to dollars, if there is any
remainder include them in the result as cents
Ex:
Enter cents
225
output:
225 cents equal to: 2 dollars and 25 cents
 */