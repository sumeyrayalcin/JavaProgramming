package day09_IfStatements;

public class SalaryCalculator {

        public static void main(String[] args) {
            double salary = 75_000;
            boolean isMarried = true;
            double textRate = 0;

            if (salary>= 130000){ //false salary < 130000;
                textRate = 0.35;
            } else if (salary>= 100000) {// false salary < 100000
                textRate = 0.30;
            } else if (salary>= 80000) {
                textRate = 0.25;
            }else {
                textRate = 0.20;
            }

            if (isMarried){
                textRate -= 0.05;
            }


            double salaryAfterTax = salary - (salary*textRate);
            System.out.println("Salary Arter Tax = " + salaryAfterTax);


/*
Write a program that can calculate the salary after tax based on the
following requirements
the tax rates are:
35% for salary of 130K or more
30% for salary of 100K to 130k
(excluded)
25% for salary of 80K to 100K
(excluded)
20% for salary less than 80K
in addition, if the person is married, he/she will pay 5%
less tax
 */






        }
}
