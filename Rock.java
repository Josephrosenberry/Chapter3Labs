/**
 * Rock Paper Scissors simulator
 * @Author Joseph Rosenberry
 * @version 9/13/17
 */
import java.util.Scanner;

public class Rock
{
    public static void main (String [] args)
    {
        String personPlay;
        String computerPlay = "U";
        int computerInt;

        Scanner scan = new Scanner (System.in);
        System.out.println ("Lets play Rock Paper Scissors");
        System.out.println ("Type R for Rock, P for Paper, S for Scissors");
        personPlay = personPlay.toUpperCase();
        computerInt = ((Math.random()* 3));

        if (computerInt == 1)
            computerPlay = "R";
        else if (computerInt == 2)
            computerPlay = "P";
        else if (computerInt == 3)
            computerPlay = "S";
        
        System.out.println ("Computers choice: " + computerInt);    
        
        if (personPlay.equals("R"))
        {
        System.out.println ("Your choice: Rock");
    }
        else if (personPlay.equals("P")){
            System.out.println ("Your choice: Paper");
    }
        else if (personPlay.equals("S")){
            System.out.println ("Your choice: Scissors");
    }
            else
            System.out.println ("Invalid letter entered");
        
    }
}    
