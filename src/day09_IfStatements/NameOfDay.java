package day09_IfStatements;

public class NameOfDay {
    public static void main(String[] args) {
        int n = 3; // 7
        String day ;
        if (n == 1){
           // System.out.println("monday");
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

    }
}
