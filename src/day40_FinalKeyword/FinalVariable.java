package day40_FinalKeyword;

public class FinalVariable {

    final String birthDay;
    final static String name;

    static {
        name = "batch";
    }

    public FinalVariable(String birthDay) {
        this.birthDay = birthDay;
    }

    public static void main(String[] args) {


        final double pi = 3.14;
        // pi = 4.14; final veriables can not be reassigned
        //pi = 5.4;

        final String name;
        name = "Java";

        // name = "wooden spoon ";

        System.out.println(name);

        FinalVariable obj = new FinalVariable("May/01");
        System.out.println(obj.birthDay);

       // obj.birthDay = "Jun/07"

        System.out.println("-----------------");
        // FinalVariable.name = "Pyton";
        System.out.println(FinalVariable.name);
    }
}
