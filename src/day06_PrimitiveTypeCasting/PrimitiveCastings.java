package day06_PrimitiveTypeCasting;

import org.w3c.dom.ls.LSOutput;

public class PrimitiveCastings {
    public static void main(String[] args) {


        byte a = 100;
        // short b = (sort) a;
        short b = a; //implicit casting


        int c = b;
        // int c = (int)b
        long d = c;
        // (long)c
        float e = d;
        double f = e;
        System.out.println("-------------");

        int x = 55;
        short y = (short)x; // explicit casting
        System.out.println(x + ":" + y);

        long j = 1000000;
        short k = (short)j;
        System.out.println(j + " : "+ k);

        double l = 2.5;
        float m = (float) l;
        System.out.println(l +" : " + m);

        double n = 10.8;
        int s = (int) n;
        System.out.println( n +" : " + s);

        float f1 = 30.5F;
        long l1 = (long) f1;




    }


}
