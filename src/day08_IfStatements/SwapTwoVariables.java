package day08_IfStatements;

public class SwapTwoVariables {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        // ----------------
        int c = b; // c = 15;
        b = a;   // b = 10
      a = c;   // a =15


        //-----------------

        System.out.println("a = " +a);
        System.out.println("b = " +b);
    }
}
/*
1. write a program that can swipe two variables' value by using a temporary variable
		    Ex:
		        if a= 10, b=15
		    output:
		        a = 15
		        b = 10
 */