package day12_Scanner;

import java.util.Scanner;

public class SpeedCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int speedLimit = 55;
        System.out.println("Speed limit =" + speedLimit );
        System.out.println("Enter current speed");
        int currentSpeed = input.nextInt();

        boolean a = currentSpeed > speedLimit;


        if (a){
            int overSpeed = currentSpeed-speedLimit;
            System.out.println("You're driving " + overSpeed +" mph over the limit. Slow down!");
        }
        input.close();

    }
}
/* write a program for the speed check. a variable named speedLimit is
given and assigned, ask user to enter the current speed, if the
current speed is over the speedLimit print slow down, otherwise do not
print anything
Ex:
speedLimit = 55;
Enter current speed:
105
output:
You're driving 50 mph over the limit. Slow down!


 */


/*
public class SpeedCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your current speed: ");
        int currentSpeed = input.nextInt();
        input.close();
        int speedLimit = 55;
        int overTheLimit = currentSpeed - speedLimit;
        if (overTheLimit > 0) {
            System.out.println("You are driving " + overTheLimit + " mph over the limit. Slow down!");
        }
 */