package day15_ForLoop;

public class Alfabet {
    public static void main(String[] args) {

        // alfabet A~Z 65-90
        for (int i = 65 ; i<= 90; i++){ // i: 65 66 67 68...
            System.out.print((char) i+" ");
        }
        System.out.println();

        for (char i = 'A'; i <= 'Z'; i++){ // i : A B C D ....
            System.out.print(i+" ");
        }
        System.out.println();
        for (char j = 'a'; j <='z'; j++){ // i : a b c d
            System.out.print(j+" ");
        }

        // Z~A
         for (char i = 'Z'; i>='A'; i--){
             System.out.print(i+" ");
         }

        System.out.println();

         for (char i = 1 ; i <= 40000; i++){
             System.out.print(i+" ");
         }




    }
}
