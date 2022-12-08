package day25_CusomMethod_Overloading;

import utilities.StringUtility;

public class test {
    public static void main(String[] args) {
        String str = "Java Programming Language";
        StringUtility.printEachChar(str);

        System.out.println("----------");
        String s1 = "Wooden Spoon";
        String reverse = StringUtility.reverse(s1);
        System.out.println(reverse);

        System.out.println("----------");
        String word = "Civic";
        boolean palindrome = StringUtility.isPalindrome(word);
        System.out.println("palindrome = "+ palindrome);


        String[] names = {"Anna", "Java", "Python", "racecar", "Mom", "Cydeo"};

        int count=0;
        for (String each:names) {
            if (StringUtility.isPalindrome(each)){
                count++;
            }

        }
        System.out.println(count);

        System.out.println("_____________");

        String str1 = "aaaaaaaabbbbbccccc";
        String str2 =StringUtility.removeDuplicates(str1);
        System.out.println(str2);




    }

    }

