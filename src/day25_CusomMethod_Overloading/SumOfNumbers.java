package day25_CusomMethod_Overloading;

public class SumOfNumbers {
    public static void main(String[] args) {
       int sum1 = sumOf2Numbers(22,33);
        System.out.println("sum of two numbers "+sum1);

        int sum2 = sumOf3Numbers(2212,32,332);
        System.out.println("sum of three numbers "+sum2);

        int sum3 = sumOf4Numbers(2,3,4,5);
        System.out.println("sum of three numbers "+ sum3);

    }
    public static int sumOf2Numbers(int a, int b){
        return a+b;
    }
    public static int sumOf3Numbers(int number1,int number2, int number3){
        return number1+number2+number3;
    }
    public static int sumOf4Numbers(int a, int b, int c,int d){
        return a+b+c+d;
    }

}
/*
Task1:
	    1. create a method that can find the sum of two numbers
	                    method name: sumOf2Numbers
	    2. create a method that can find the sum of three numbers
	                    method name: sumOf3Numbers
	    3. create a method that can find the C
	                    method name: sumOf4Numbers
 */