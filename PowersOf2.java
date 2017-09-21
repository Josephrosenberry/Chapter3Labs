/**
 * PowersOf2.java
 * @author Joseph Rosenberry
 * @version 9/20/2017
 */
import java.util.Scanner;
public class PowersOf2
{
    public static void main(String[] args)
    {
        int numPowersOf2; //How many powers of 2 to compute
        int nextPowerOf2 = 1; //Current power of 2
        int exponent; //Exponent for current power of 2 -- this
        //also serves as a counter for the loop
        Scanner scan = new Scanner(System.in);
        System.out.println("\fHow many powers of 2 would you like printed?");
        numPowersOf2 = scan.nextInt();

        System.out.println("The first " + numPowersOf2 + " powers of two are: ");
        exponent = 1;
        int x = 0;
        while ( x < numPowersOf2 )
        {
            System.out.println ("2^" + x + " = " + exponent);//print out current power of 2
            exponent *= 2;//find next power of 2 -- how do you get this from the last one?
            x++;//increment exponent
        }
    }
}