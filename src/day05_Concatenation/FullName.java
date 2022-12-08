package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {
        String firstName = "jimmy";
        String lastName = "king";
        String fullName = firstName + " " + lastName;
        System.out.println("Full name of the person is " + fullName);
        int years = 32;
        String jobTitle = "SDET";
        String companyName = "Apple INc";
        int salary = 20000;
        System.out.println(fullName + " is " + years + " 'years old" );
        System.out.println(fullName + " is " + jobTitle +", works at " + companyName +", and " + fullName + " salary is $" + salary );
    }
}
