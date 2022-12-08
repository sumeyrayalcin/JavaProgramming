package day10_NestedIf;

public class NestedIfIntro {
    public static void main(String[] args) {

        int score = 95;

        if (score>= 0 && score <= 100 ) { // if score is valid
            if (score >= 60) {//if student passed the exam
                System.out.println("passed ");
            } else {
                System.out.println("failed");

            } }else{// if the score is not valid
                System.out.println("invalid score");
            }


        int age = 25;
        boolean hasId = true;

        if (hasId) {
            if (age >= 21) {
                System.out.println("eligible to buy alcahol");
            } else {
                System.out.println("not eligible to buy alcohol");
            }
        }else{ // if the person does not have an ID
                System.out.println(" you must have an ID to buy alcahol");


        }
            System.out.println("---------------");



        int number = 9;
        if (number >= 1 && number <= 7 ) { // if the number is a valid number
            // 7 options
            if (number == 1) {
                System.out.println("monday");
            } else if (number == 2) {
                System.out.println("tuesday");
            } else if (number == 3) {
                System.out.println("wednesday");
            } else if (number == 4) {
                System.out.println("thursday");
            } else if (number == 5) {
                System.out.println("friday");
            } else if (number == 6) {
                System.out.println("saturday");
            } else {

                System.out.println("sunday");
            }


        }else { // if the number is not valid
            System.out.println("Invalid Number");

        }











    }
}
