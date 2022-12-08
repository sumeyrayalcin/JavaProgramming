package day15_ForLoop;

import java.util.Scanner;

public class Java_avaJ {
    public static void main(String[] args) {
        //Write a program that can reverse any give string Java ==> avaJ
        System.out.println("enter a word");
        Scanner scan = new Scanner(System.in);
       
            String input = scan.next();
            String word = "";
            for (int i = input.length() - 1; i >= 0; i--) {
                word += input.charAt(i);
            }

        System.out.println(word);

            scan.close();


    }
}
