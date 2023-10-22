import java.util.Scanner;


/*
Complete the method quartsToLiters() that takes one integer parameter as a volume in quarts. The method returns a double as the volume converted to liters, given that 1 quart = 0.946353 liters.

Ex: If the input is 25, then the output is:

Result: 23.659 liters
 */

public class VolumeConversion {
    public static double quartsToLiters(int userQuarts) {

        /* Your code goes here */

        double volume = userQuarts * 0.946353;
        return volume;



    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int quarts;

        quarts = scan.nextInt();

        // Print with value rounded to 3 decimal places
        System.out.printf("Result: %.3f liters\n", quartsToLiters(quarts));
    }
}