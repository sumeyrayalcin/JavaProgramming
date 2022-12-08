package day11_Switch_Scanner;

public class Asss {
    public static void main(String[] args) {
        byte b = 104;
        boolean check = b < 100;
        if (check){
            b -= 100;
        } else{
            b=50;
        }
        System.out.println(b);
    }

}
