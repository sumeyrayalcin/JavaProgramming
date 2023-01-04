package day11_Switch_Scanner;

import java.util.Scanner;

public class StatusCode {
    public static void main(String[] args) {
        // DO NOT TOUCH BELOW
        System.out.println("Enter status code:");
        Scanner scan = new Scanner(System.in);
        int status = scan.nextInt();

        // WRITE YOUR CODE BELOW:

        String value = "";
        switch (status) {
            case 200:
                value = "OK";
                System.out.println(value);
                break;
            case 202:
                value = "Created";
                System.out.println(value);
                break;
            case 307:
                value = "Temporary Redirect";
                System.out.println(value);
                break;
            case 400:
                value = "Bad Request";
                System.out.println(value);
                break;
            case 401:
                value = "Unauthorized";
                System.out.println(value);
                break;
            case 403:
                value = "Forbidden";
                System.out.println(value);
                break;
            case 404:
                value = "Not Found";
                System.out.println(value);
                break;

            case 410:
                value = "Gone";
                System.out.println(value);
                break;
            case 500:
                value = "Internal Server Error";
                System.out.println(value);
                break;
            case 303:
                value = "Service Unavailable";
                System.out.println(value);
                break;
            default:
                System.out.println("Invalid status code");

        }

    }
}
