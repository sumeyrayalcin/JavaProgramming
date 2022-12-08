package day25_CusomMethod_Overloading;

import utilities.ArraysUtility;

public class test2 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        ArraysUtility.printEach(arr1);

        System.out.println("------------");
        double[] arr2 = {1.5, 2.5, 3.5, 4.5};

        ArraysUtility.printEach(arr2);

        System.out.println("--------------------------------");

        char[] arr3 = {'A', 'B', 'C', 'D'};

        ArraysUtility.printEach(arr3);

        System.out.println("--------------------------------");

        String[] names = {"David", "Elvira", "Ali", "Igor"};

        ArraysUtility.printEach(names);

        System.out.println("--------------------------------");

        int[] n1 = {3,445,5,67,7,8};
        int max = ArraysUtility.maxNum(n1);
        System.out.println(max);

        double[] n2 = {2.3,4.5,6.7,78.8};
        double max1 = ArraysUtility.maxNum(n2);
        System.out.println(max1);

        int[] m1 = {4,8,54,24,5,46};
        int min = ArraysUtility.min(m1);
        System.out.println(min);

        int[] a1 ={1,2,3,4,5,6,7};
        boolean r1 = ArraysUtility.contains(a1,5);
        System.out.println("r1 = " + r1);
    }
}
