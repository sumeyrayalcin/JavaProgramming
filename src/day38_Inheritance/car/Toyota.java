package day38_Inheritance.car;

public class Toyota extends Car{
    public Toyota(String model, int year, double price, String color, int miles) {
        super("Toyota", model, year, price, color, miles);
    }

    public void start(){
        System.out.println("Twist the key to ignition to start "+brand+" "+model);
    }

    public void reliable(){
        System.out.println(brand + " "+ model + "is reliable");
    }
}

/*
1. Toyota:
extra methods:
reliabile()
 */