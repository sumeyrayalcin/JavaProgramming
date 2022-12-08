package day04_Variables;

public class SalaryCalculator {
    public static void main(String[] args) {
        // hourly rate, weekly hours
        int hourlyrate = 50;
        int weeklyours =40;
        int salary = hourlyrate * weeklyours * 52;
         System.out.println("hourlyrate =  $" + hourlyrate);
         System.out.println("weeklyours = " + weeklyours);
         System.out.println("salary = $" + salary);



        System.out.println(salary);
    }
}
