/**
 * Factorials.java
 * @author Joseph Rosenberry
 * @version 9/20/2017
 */
import java.util.Scanner;
public class Factorials{
    public static void main (String [] args){
        Scanner scan = new Scanner (System.in);
        System.out.print("\fPlease enter a positive integer: ");
        int input = scan.nextInt(); //Users input
        int c = 1;
        int factorialnum = 1;
        while ( input < 0){
            System.out.println("Invalid character. Try again: ");
            input = scan.nextInt();
        }
        if (input ==0) {
            System.out.println("!" +input + "is 1");
        }
        else {
            while (c <= input){
                factorialnum = factorialnum * c;
                c++;
            }
            System.out.println("!" + input + " is " + factorialnum );
    }
}
}