package day10_NestedIf;

public class GradeReport {
    public static void main(String[] args) {
        /*
        90-100: exelent
        80-89: great
        70-79: good
        60-69: passed
        0-59: failed
         */

        int s = 45;

        if (s>= 0 &&  s <= 100) {
            // 5 possibilities

            if (s >= 0 ) {
                System.out.println("failed");
            } else if (s >= 60 ) {
                System.out.println("passed");
            } else if (s >= 70 ) {
                System.out.println("good");
            } else if (s >= 80 ) {
                System.out.println("great");
            } else {
                System.out.println("exelent");
            }
        }else {
            System.out.println("s is not valid");
        }
        System.out.println("----------");

        String result = ""; // temporary
        int score1 = 78;

        if (score1>= 0 &&  score1 <= 100) {
            // 5 possibilities

            if (score1 >= 0 ) {
                result="failed";
            } else if (score1 >= 60 ) {
                result="passed";
            } else if (score1 >= 70 ) {
                result="good";
            } else if (score1 >= 80 ) {
                result="great";
            } else {
                result="exelent";
            }
        }else {
            System.out.println("score is not valid");
        }




    }
}
