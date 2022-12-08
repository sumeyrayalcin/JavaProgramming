package day24_CustomMethods_Return;

public class ReturnMethodIntro1 {
    public static void main(String[] args) {

      int c = sumFun(6,5);
      int d = multFun(c, 2);
      System.out.println(d);

    }


    public static void reverse(String str){
        String reverse = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            reverse += str.charAt(i);
        }
        System.out.println();


    }

    public static int sumFun(int a, int b){
        int sum = a + b;
        System.out.println(sum);
        return sum;
    }
    public static int multFun(int a, int b){
        int sum = a * b;
        System.out.println(sum);
        return  sum;
    }

}
