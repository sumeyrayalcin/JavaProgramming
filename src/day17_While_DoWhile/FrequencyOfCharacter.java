package day17_While_DoWhile;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        String str = "AAABBBCAAAAAAAAAAAAAAAAA";
        char ch = 'B';
        int frequency = 0; //+1+1+1==>3
        for (int i = 0; i <= str.length()-1 ; i++) { // i: indexes of string
            //'A'=='B'
            char eachChar = str.charAt(i); //each character of string
            if (ch == eachChar){
                frequency++;

            }


        }

        System.out.print(frequency);



    }
}
/*
 1. Write a program that can return the frequency of a char from a String

 			Ex:
 				str = "AAABBBC"
 				ch = 'A'

 			Output:
 				3
  */