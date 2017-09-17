import java.util.Scanner;
import java.text.NumberFormat;
public class PizzaOrder
{
    public static void main (String [] args)
    {
        Scanner scan = new Scanner (System.in);
        
        String firstName;
        boolean discount = false;
        int inches;
        char crustType;
        String crust = "hand-tossed";
        double cost = 12.99;
        final double TAX_RATE = .08;
        double tax;
        char choice;
        String input;
        String toppings = "Cheese ";
        int numberOfToppings = 0;
        
        System.out.println("\fWelcome to Mike and Diane's Pizza");
        System.out.print("Enter your first name: ");
        firstName = scan.nextLine();
        
        if (firstName.equalsIgnoreCase("Diane") || firstName.equalsIgnoreCase("Mike"))
            {
                discount = true;
       
    }
    
    System.out.println("Pizza Size (inches)\t Cost");
    System.out.println("\t\t10\t $10.99");
    System.out.println("\t\t12\t $12.99");
    System.out.println("\t\t14\t $14.99");
    System.out.println("\t\t16\t $16.99");
    System.out.println("What size pizza would you like?");
    System.out.println("10, 12, 14, or 16, (enter number only): ");
    inches = scan.nextInt();
    
    if (inches==10)
        {
            cost = 10.99;
}
    else if (inches ==12)
        {
            cost = 12.99;
}
else if (inches ==14)
        {
            cost = 14.99;
}
else if (inches ==13)
        {
            cost = 16.99;
            
}
    else 
    {
        System.out.println("Invalid Number Entered");
    }
    System.out.println("What kind of crust do you want?: ");
    System.out.println("Hand-tossed, Thin-crust, or Deep Dish, enter H, T, or D");
    input = scan.next();
    crustType: input.charAt(0);
    
    if (crustType.equals("H")
}
}