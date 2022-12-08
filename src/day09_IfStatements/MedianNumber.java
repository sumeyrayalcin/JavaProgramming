package day09_IfStatements;

public class MedianNumber {
    public static void main(String[] args) {
        int a = 10,
                b = 15,
                c = 20;

        // if we have three different numbers, one MUST maximum, one MUST be minimum and one MUST be Median
        boolean aisMedian = (a >b && a<c) || (a >c && a<b);
        /*
            in order for a to be the median number:
                    1. if c is the maximum number & b is the minimum number, then a is the median number
                    2. if b is the maximum number & c is the minimum number, then a is the median number
             */

        boolean bisMedian = (b>a && b<c) || (b<a && b>a);
        boolean cisMedian = !aisMedian && !bisMedian;
        // boolean cisMedian = (c>a && c<b) || (c<a && c>b);

        if (aisMedian) {
            System.out.println("a is median number ");
        }
            if (bisMedian) {
                System.out.println("b is median number");
            }

                if (cisMedian){
                    System.out.println("c is median number");}


    }
}
/*
2. Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers
			Ex:
				a = 10, b= 15, c = 20;
			Output:
				15 is the median number
			Possibility #1: a could be median number
			Possibility #2: b could be median number
			Possibility #3: c could be median number
 */