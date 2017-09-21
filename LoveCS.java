/**
 * LoveCS.java
 * @author Joseph Rosenberry
 * @version 9/20/2017
 */
import java.util.Scanner;
public class LoveCS
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);
        System.out.print("\fHow many times do you want \"I love Computer Science\" to be printed: ");
        int limit = scan.nextInt();
        int count = 1;
        int sum = 0;
        while (count <= limit){
            System.out.println("I love Computer Science!!");
            sum  = count + sum;
            count++;
        }
        System.out.println ("Printed this message " + (count - 1) + " times. The sum of the" +
                            " numbers from 1 to " + (count - 1) + " is " + sum + "."); 
    }
}