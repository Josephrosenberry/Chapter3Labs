/**
 * Chars.java
 * @author Joseph Rosenberry
 * @version 9/20/2017
 */
import java.util.Scanner;
public class Chars{
    public static void main (String [] args){
    
        Scanner scan = new Scanner (System.in);
        System.out.print("\fPlease enter a string of characters: ");
        String string = scan.nextLine();
        int x = string.length();
        for (int c=0; c<x; c++){
            System.out.println(string.charAt(c));
        
    }
}
}