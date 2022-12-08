package day14_String;

public class StringMethods3_Substring {
    public static void main(String[] args) {
//substring(beginning index, ending index )
        String word = "Cydeo School";
        //             01234....
        String brand = word.substring(0,4+1);
        //string brand
        System.out.println(brand);

        String str1 = word.substring(6);
        System.out.println(str1);
        String word2 = "Java Programming Language";

        String s1 = word2.substring(0,word2.indexOf(" "));   //java
        //String s2= word2.substring( word2.indexOf("P"),word2.indexOf(" L"));   //programming
        //String s3= word2.substring(word2.indexOf("L"),word2.lastIndexOf("e")+1);   //language

        String s2 = word2.substring( word2.indexOf(" ")+1 ,   word2.lastIndexOf(" ") ); //"C#"
        String s3 = word2.substring( word2.lastIndexOf(" ")+1  ); //"Language"

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
