package day27_WrapperClasses;

import java.util.Arrays;

public class TasksDay27 {
    public static void main(String[] args) {


        String inp = "today it will be 110 degrees !";
        int n = 0;
        while (n++ < inp.length()){
            if (n==8){
                continue;
            } else if (n==9) {
                break;

            }
            System.out.println(inp.charAt(++n));
        }


        int count = 0;
        for (int a = 0; a < 4; a++) {
            if (a==3)
                continue;
            for (int b = a+1; b <5 ; b++) {
                count++;
                if (b==3)
                    break;
            }
        }
        System.out.println(count);


        System.out.println("------------------");

        int [] nums = {14, 1,84,97,1243,46};
        int total =0;
        for (int i = 0; i < nums.length; i++) {
            if( nums[i]% 2 !=0){
                if(nums[i]% 2 !=0){
                    total+=3;
                }else {
                    total +=10;
                }
                if (i % 3 ==0){
                    total-=15;
                }

            }
            System.out.println(total);
        }



        String[] things = {"house","shed","slide","zebra","park","garden"};
        for (String s:things) {
            switch (s.charAt(1)){
                case 'h':
                    System.out.println(1);
                    break;
                case 'a':
                    System.out.println(2);
                case 's':
                    System.out.println(3);
                    break;
                case 'o':
                default:
                    System.out.println(4);
                case 'p':
                    System.out.println(5);
                    break;

                case 'z':
                    System.out.println(6);
                case 'l':
                    break;

                case 'g':
                    System.out.println(7);
            }

        }

        System.out.println("-------------------------");

        int[] arr ={1,3,12,5,24,7,9,10};
        boolean[] bArr = new boolean[arr.length];
        for (int i = arr.length-1; i > -1 ; i--) {
            if (arr[i] % 2 == 0){
                bArr[arr.length-1-i]= true;
            }

        }
        System.out.println(Arrays.toString(bArr));

    }
}
/*
1. Insert Task:
1.1 Create a method named insert that passes three
parameters: integer array, integer index, integer element. the method
inserts the given element to the given index of the array and returns the
new array
Ex:
arr = {10, 20, 30, 40, 50};
insert(arr, 2, 100) ==> {10,
20, 100, 30, 40, 50}
1.2 Create the same function for double array, char array
and string array
2. Swap Task:
2.1 Create a method named swap that passes three parameters: integer
array, integer i, integer j. the method swaps the element at index i with
the element at index j, and returns the new array
Ex:
arr = {10, 20, 30, 40, 50};
swap(arr, 2, 4) ==>  {10, 20, 50, 40,
30}
2.2 Create the same function for double array, char array and string
array
3. Write a program that can retrieve the letters, digits and special
characters from the string
Ex:
str = "Wooden Spoon!"
output:
letters= "WoodenSpoon";
Digits = "";
specialChars = " !";
4. Write program that returns true if the total number of upper case
characters are equal to total number of Lowercase characters of a
string
Ex:
str = "JAVA java";
output:
true
 */