package day25_CusomMethod_Overloading;

import day28_ArrayList.ArrayListIntro;

import java.util.ArrayList;

public class QuizTask3 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("i");
        arr.add(0,"1");
        arr.add("i");
        arr.add(2,"5");
        arr.remove(1);
        arr.add("e");
        arr.add("i");
        arr.remove("i");
        System.out.println(arr);
    }
}
