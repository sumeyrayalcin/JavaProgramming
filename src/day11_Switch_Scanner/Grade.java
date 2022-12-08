package day11_Switch_Scanner;

public class Grade {
    public static void main(String[] args) {
        char ch = 'B';
        String result = "";
        switch (ch){

            case 'A' :
                result ="Exelent";
                break;
            case 'B' :
                result ="Great Job";
                break;
            case 'C' :
                result="Good";
                break;
            case 'D' :
                result="passed";
                break;
            case 'E' :
                result="failed";
                break;
            default:
                result="invalid";


        }
        System.out.println(result);
    }
}
/*
 3. a char variable named grade is given. use switch statement to print the following messages:
 			'A': excellent
 			'B': great job
 			'C': good
 			'D': passed
 			'F': failed
 			other wise: invalid

  */