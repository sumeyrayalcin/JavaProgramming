package utilities;

import day34_GarbageCollection_AccessModifiers.AccessModifiers;

public class AccessModifierss_Test2 {
    public static void main(String[] args) {
        System.out.println(AccessModifiers.publicData);
        // System.out.println(AccessModifiers.defaultData); is not visible outside the package
        // System.out.println(AccessModifiers.privateData); not acceseble


        AccessModifiers.method1();
       // AccessModifiers.method2();
       // AccessModifiers.method3();  different package and different class
    }
}

