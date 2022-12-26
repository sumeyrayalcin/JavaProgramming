package utilities;

import day40_FinalKeyword.ProtectedAccessModifier;

public class AccesModifiers_Test4 extends ProtectedAccessModifier {
    public static void main(String[] args) {
       // System.out.println(AccesModifiers_Test4.name1); //default
        System.out.println(AccesModifiers_Test4.name2);  //protected is visible


       // AccesModifiers_Test4.method1();
        AccesModifiers_Test4.method2();
    }
}
