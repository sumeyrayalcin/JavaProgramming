package day06_PrimitiveTypeCasting;

public class ArithmeticOperators {
    public static void main(String[] args) {
        System.out.println(12 + 1); //addition
        System.out.println(100 - 50); //subtraction
        System.out.println(10 * 6 ); // multiplication


        System.out.println(100 / 3);   //33
        System.out.println(10.0/4);    //2.5
        System.out.println(10/4.0);    //2.5
        System.out.println(10d/4);     //2.5
        System.out.println(10D/4);    //2.5

        int a = 100;
        double b = a/6 ; //16.0
        System.out.println(b);

        double c = a/6d;
        System.out.println(c);

        double f = (double) a/6;
        System.out.println(f);




    }
}
