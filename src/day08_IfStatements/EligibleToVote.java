package day08_IfStatements;

public class EligibleToVote {
    public static void main(String[] args) {

        String name = "josh";
        int age = 18;
        String citizen = "USA";

        boolean isEligible = age >= 21 && citizen == "USA";
        // eligible
        if(isEligible){
            System.out.println("Eligible");
        }

        if(!isEligible){
            System.out.println("Not Eligible");
        }

    }
}
