package day08_IfStatements;

public class SingleIfStatementIntro {
    public static void main(String[] args) {

        int number = 101;
        boolean evenNumber = number %2 == 0;
        boolean oddNumber = ! evenNumber;
        if(evenNumber) {

            System.out.println(number + " is even  Number");
        }
        if(oddNumber) {  // not even number
            System.out.println(number + " is odd Number");
        }

        int n = -500;

        //positive
        if(n>0){
            System.out.println(n + " is positive");
        }
        //negative
        if(n<0 ){
            System.out.println(n +" is negative ");
        }
        //zero
        if( n== 0){
            System.out.println(n +" is zero");
        }









    }
}
