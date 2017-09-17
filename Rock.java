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
        System.out.println ("\fLets play Rock Paper Scissors");
        System.out.println ("Type R for Rock, P for Paper, S for Scissors");
        personPlay = scan.nextLine();
        personPlay = personPlay.toUpperCase();
        computerInt = ( (int)(Math.random()* 3));

        if (computerInt == 0)
            computerPlay = "R";
        else if (computerInt == 1)
            computerPlay = "P";
        else if (computerInt == 2)
            computerPlay = "S";
        
        System.out.println ("Computers choice: " + computerPlay);    
        
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
            else {
            System.out.println ("Invalid letter entered");
        }
       if (computerPlay.equals(personPlay))
        System.out.println("Its a tie!");
       else if (computerPlay.equals("S")){ 
        if (personPlay.equals("P"))
       System.out.println("Scissor cuts paper. You lose!!");
        else if (personPlay.equals("R"))
            System.out.println("Rock beats scissors. You win!");
    }
    else if (computerPlay.equals("R")){
        if (personPlay.equals("P"))
            System.out.println("Paper eats rock. You win!!"); 
        else if (personPlay.equals("S")){
            System.out.println("Rock beats paper. You lose!");
        }
    else if (computerPlay.equals("S")) {
         if (personPlay.equals("P")) 
         System.out.println("Scissor cuts paper. You lose!"); 
         else if (personPlay.equals("R"))
         System.out.println("Rock crushes scisssors. You win!");
        }
        
    else 
         System.out.println("Invalid user input."); 
    }
}  
}