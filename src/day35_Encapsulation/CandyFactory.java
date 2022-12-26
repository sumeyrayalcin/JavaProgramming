package day35_Encapsulation;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactory {
    public static void main(String[] args) {
        ArrayList<Candy> candies = new ArrayList<>();
        candies.addAll(Arrays.asList(
                new Candy("M&M", 60, 1.5, false),
                new Candy("M&M", 50, 2.5, false),
                new Candy("M&M", 43, 4.5, false),
                new Candy("M&M", 32, 5.5, false),
                new Candy("M&M", 21, 6.5, false)
        ));

        for (Candy candy: candies) {
            System.out.println( candy.getBrand() +" " + candy.getPrice());
            
        }

    }
}

/*
reate a class named CandyFactory
Create an ArrayList of candies
Add five objects of candies
use for each loop to print the brand and price of each
candy
 */