package day22_MultiDimensionalArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseArrays {
    public static void main(String[] args) {
        int arr2D [][] = { {1,2,3}, {4,5,6}};
       /* for (int[] eachArr2 : arr2D) {
         //   System.out.println(Arrays.toString(eachArr2));

            int[] reversed = new int[eachArr2.length];
            int j = 0;

            for (int i = eachArr2.length-1; i >=0 ; i--,j++) {

                reversed[j] +=eachArr2[i];

            }

            System.out.print(Arrays.toString(reversed))
        }*/

        int[][] array = {{1, 2, 3}, {4, 5, 6}};
        int[][] revarray = new int[array.length][array[1].length];

        int k = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            int l = 0;
            for (int j = array[i].length - 1; j >= 0; j--) {
                revarray[k][l] = array[i][j];
                l++;
            }k++;
        }System.out.println(Arrays.deepToString(revarray));







    }
}
/*
1. Write a program that can reverse a two dimensional array (return new
array)
Ex:
array = { {1,2,3}, {4,5,6}};
output:
reverse = { {6,5,4}, {3,2,1},};
 */