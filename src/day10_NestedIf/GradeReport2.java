package day10_NestedIf;

public class GradeReport2 {
    public static void main(String[] args) {
      int s = 78;
      String result = (s>= 0 &&  s <= 100)?(s >= 90 )?"exelent":(s >= 80 )?"great"
        :(s >= 70 )?"good":(s >= 60 )? "passed":"failed"
              :"s is not valid";


        System.out.println(result);
        System.out.println("---------------");
 /*
        // solution2: use ternaries ONLY
        String result = (s >= 0 && s <= 100) ? (s >= 90) ? "Excellent" : (s >= 80) ? "Great" : (s >= 70) ? "Good"
                        : (s >= 60) ? "Passed" : "Failed" : "Invalid Score";
        System.out.println(result);
         */

        System.out.println("-------------------------------------------");
        // solution3:
      /*  String result2 = "";

        if (s >= 0 && s <= 100) { // if the s is valid (0 ~ 100 )

            result2 = (s >= 90) ? "Excellent" : (s >= 80) ? "Great" : (s >= 70) ? "Good" : (s >= 60) ? "Passed" : "Failed";

        } else { // if the s is NOT valid
            result2 = "Invalid Score";
        }

        System.out.println(result2); */



    }
}
