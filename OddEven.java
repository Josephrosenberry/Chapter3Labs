/**
 * OddEven.java
 * @author Joseph Rosenberry
 * @version 9/20/17
 */
import java.util.Scanner;
public class OddEven{
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("\fPlease enter a positive integer: ");
        String input = scan.nextLine();
        int x = input.length();
        int odd = 0, even = 0, zero = 0;
        for ( int c=0; c<x; c++){
            if (input.charAt(c) =='0'){
                zero++;
            }
            else if (input.charAt(c)%2 ==1){
                odd++;
            }
            else if (input.charAt(c)%2 ==0){
                even++;
            }
        }
        if (even != 1){
            System.out.println ("There are " + even + " even digits."); 
        }
        else
            System.out.println ("There is " + even + " even digit");
        if (odd != 1){
            System.out.println ("There are " + odd + " odd digits."); 
        }
        else
            System.out.println ("There is " + odd + " odd digit");
        if (zero != 1){
            System.out.println ("There are " + zero + " zero digits."); 
        }
        else
            System.out.println ("There is " + zero + " zero digit");
    }
}