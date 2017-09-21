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
        crustType = 0;
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
    crustType = input.charAt(0);
    if (crustType == 'H' || crustType == 'h') {
        crust = "Hand-Tossed";
    } else if (crustType == 'T' || crustType == 't') {
        crust = "Thin-Crust";
    } else if (crustType == 'D' || crustType == 'd') {
        crust = "Deep-Dish";
    }
    else {
        System.out.println("Invalid letter entered");
    }
    crust = "Hand-Tossed";
    System.out.println("All pizzas come with cheese.");
    System.out.println("Additional toppings are $1.25 each, choose from");
    System.out.println("Pepperoni, Sausage, Onion, Mushroom");

    
    System.out.print("Do you want Pepperoni? (Y/N)  ");
    input = scan.next();
    choice = input.charAt(0);
    if (choice == 'Y' || choice == 'y')
        {
            numberOfToppings += 1;
            toppings = toppings + "Pepperoni ";
        }
    
    System.out.print("Do you want Sausage?  (Y/N):  ");
        input = scan.next();
        choice = input.charAt(0);
        if (choice == 'Y' || choice == 'y')
        {
            numberOfToppings += 1;
            toppings = toppings + "Sausage ";
        }
   
    System.out.print("Do you want Mushrooms?  (Y/N):  ");
        input = scan.next();
        choice = input.charAt(0);
        if (choice == 'Y' || choice == 'y')
        {
            numberOfToppings += 1;
            toppings = toppings + "Mushrooms ";
        }
    
    System.out.print("Do you want Onion?  (Y/N):  ");
        input = scan.next();
        choice = input.charAt(0);
        if (choice == 'Y' || choice == 'y')
        {
            numberOfToppings += 1;
            toppings = toppings + "Onion ";
        }
    cost = cost + (1.25*numberOfToppings);
    
    System.out.println();
    System.out.println("Your order is as follows: ");
    System.out.println(inches + " inch pizza");
    System.out.println(crust + " crust");
    System.out.println(toppings);
    
    if (firstName.equalsIgnoreCase("Diane") || firstName.equalsIgnoreCase("Mike"))
            {
                System.out.println("$2.00 discount because you share a name with a owner!");
       
    }
    
    NumberFormat finalcost = NumberFormat.getCurrencyInstance();
        NumberFormat finaltax = NumberFormat.getCurrencyInstance();
        System.out.println("The cost of your order is: " + finalcost.format(cost));
    
    tax = (TAX_RATE*cost);
    System.out.println("The tax is:  " + finaltax.format(tax));
    System.out.println("The total due is: $" + (finaltax.format(tax+cost)));
    System.out.println("Your order will be ready for pickup in 30 minutes.");
}
}
