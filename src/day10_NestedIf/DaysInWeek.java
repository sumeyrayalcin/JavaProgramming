package day10_NestedIf;

public class DaysInWeek {
    public static void main(String[] args) {

        int n = 3; // 7
       /* String day ;
        if (n == 1){

            day ="monday";

        } else if (n ==2) {
            //System.out.println("tuesday");
            day ="tuesday";
        }else if (n==3) {

            //System.out.println("wednesday");
            day ="wednesday";
        } else if (n==4) {
            //System.out.println("thursday");}
            day ="thursday";}
        else if (n==5 ) {
            day = "friday";

            // System.out.println("fiday");

        } else if (n==6) {

            day = "saturday";
            //System.out.println("saturday");

        } else {
            // System.out.println("sunday");
            day = "sunday";
        }
        System.out.println("day = "+ day );
        */

        System.out.println("-----------------");
        String result = (n ==1)? "monday": (n==2)? "tuesday" : (n==3)? "wednesday" : (n==4) ?"thursday":(n==5)?  "friday" : (n==6)? "saturday" : "sunday";

        System.out.println(result);


    }
}
