package day38_Inheritance.car;

public class ParkingLot {
    public static void main(String[] args) {
        Toyota toyota = new Toyota("Camry",2020,4465,"red",5859);

        Tesla tesla = new Tesla("Model S", 2022, 94990, "Red", 0);

        BMW bmw = new BMW("X5", 2020, 67350, "black", 12000);



        toyota.start();
        tesla.start();
        bmw.start();


    }
}
