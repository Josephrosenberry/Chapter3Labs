/**
 * Guess.java
 * @author Joseph Rosenberry
 * @version 9/20/2017
 */
import java.util.Scanner;
import java.util.Random;
public class Guess
{
    public static void main(String[] args)
    {
        int numberoftries = 1;
        int guess; //The user's guess
        int toohigh = 0, toolow = 0;
        int numToGuess;
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
        numToGuess = (int) (Math.random() * 11);//randomly generate the number to guess
        System.out.println("\fI'm thinking of a number from 1 to 10! \nTry and Guess: ");//print message asking user to enter a guess
        guess = scan.nextInt();//read in guess

        while (guess != numToGuess ) //keep going as long as the guess is wrong
        {
            if (guess > numToGuess){
                System.out.println("Too high, try again!");
                toohigh++;
            }
            else if (guess < numToGuess){
                System.out.println("Too low, try again!");
                toolow++;
            }
            guess = scan.nextInt();
        }
        numberoftries = numberoftries + toohigh + toolow;
        System.out.println("You got it, after only " + numberoftries + " guesses");
        System.out.println(toohigh + " guesses were too high. \n" + toolow + " guesses were too low.");
    }
}