package day08_IfStatements;

public class LogicalOperations {
    public static void main(String[] args) {
        String name = "Streven";
        int age = 19;
        String citizen = "UK";

        boolean isEligible = age >= 18 && citizen == "USA";
        //    19>= 18 && "UK" == "USA"
        //     true && false
        // false

        System.out.println(name + "is eligible to vote: " + isEligible);
        System.out.println("--------------------------------------------");

        String name2 = "Josh";

        int creditScore = 720;
       int age2 = 23;
       boolean isEligible2 = creditScore >= 700 && age2 >= 21;
        System.out.println(name2 + "is eligible for loan: " + isEligible2);
        System.out.println("-----------------------------------------------");

        String name3 = "Shay";

        int age3 = 21;
        char gender = 'F';
        boolean isEligible3 = age >= 18 && ( gender == 'M' || gender == 'F');
//                            21 >= 18 && ('F '== 'M' || 'F' == 'M')
        //                    T && ( F || T)
        //                    T && T

        System.out.println(name3 + "is eligible to register: " + isEligible3);

        String name4 = "James";

        String countryOfBirth = "USA";
        boolean marriedToUSCitizen = false;

        boolean isEligible4 =  countryOfBirth == "USA" || marriedToUSCitizen == true;
        //                       true

        System.out.println(name4 +" is eligible to apply for US citizenShip: "+isEligible4);

        System.out.println("----------------------------------------------------------------");

        String student = "Ali";

        double gpa = 2.5;
        int familyIncome = 50000;

        boolean isEligible5 =  gpa >= 3.5 || familyIncome <= 60000;
        //                      false || true

        System.out.println(student +" is eligible for scholarship: "+isEligible5);

        System.out.println("-------------------------------------------");

        boolean result2 = true;

        System.out.println("result2 = " + result2);

        boolean result3 = !result2;

        System.out.println("result3 = " + result3);

        System.out.println("-------------------------------------------");

        int score = 55;
        boolean passed = score >= 60;
        boolean failed = !passed;

        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);





    }
}
