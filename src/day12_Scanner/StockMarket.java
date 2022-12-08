package day12_Scanner;

import java.util.Scanner;

public class StockMarket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("how many total shares you have already");
        int shares = input.nextInt();
        if (shares>0){
            System.out.println("how much your total value in the stock market is");
            double value = input.nextDouble();

            input.nextLine();
            System.out.println("enter the name of the company you have");
            String nameOfCampany = input.nextLine();

            System.out.println("Your total stock market holding is" + " $"+ value +
                            " which is made up of "+
                    shares + " shares. " + nameOfCampany +" is your company holdings");

        }
input.close();

    }
    /*
    eger burda input.nextline() i nameOfCamoany den sonra yazarsam sirketin adini
    soruyor ama yazmiyor.

    eger nextline() yazmazsam sirketin adini hic almiyor.

    eger tanimlamadan once yazarsam hem aliyor hem yaziyor
     */
}
/*
StockMarket task:
- Ask the user how many total shares they have already? (int)
-> If the user gives 0 or give a negative number none of the
rest condition should be executed
- Ask the user how much their total value in the stock market is
(double)
- Ask the user to enter the name of the company they have the
most shares in (String, multiple words)
- Print in the following format:
Ex:
inputs: 100, 25000, Apple INC
"Your total stock market holding is $25000 which is made up of
100 shares. Apple INC is your company holdings"
 */