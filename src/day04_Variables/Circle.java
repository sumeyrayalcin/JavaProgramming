package day04_Variables;

public class Circle {
    /*
    Create a class named Circle, write a program that can calculate
the area & perimeter of any given Circle
PI, radius, diameter, area, perimeter
Hints: PI = 3.14
area = radius * radius * PI
Perimeter = 2 * radius * PI
     */
    public static void main(String[] args) {
        double PI = 3.14;
        double radius = 3.5;
        double diometer = 2 * radius;
        double area = radius * radius;
        double perimeter = 2 * radius * PI;
        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);
        System.out.println("diometer = " + diometer);



    }
}
