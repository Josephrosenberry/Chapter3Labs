import java.util.Scanner;
public class Main{
  public static void main (String [] args){
    String grade;
    Scanner scan = new Scanner (System.in);
    System.out.print ("Enter your grade: (Q to quit): ");
     grade = scan.nextLine();
    grade = grade.toUpperCase();
    
    
    while (!grade.equals("Q")){
     if (grade.equals("A"))
       System.out.print("Excellent!");
      else if (grade.equals("B"))
        System.out.print("Good!");
      else if (grade.equals("C")||grade.equals("D"))
        System.out.print("Poor");
      else if (grade.equals("F"))
        System.out.print("Failure");
      else
        System.out.print("Invalid Grade Entered");
        
      System.out.print ("Enter your grade: (Q to quit): ");
      grade = scan.next();
      grade = grade.toUpperCase();
    }  
      System.out.println("Goodbye!");
  }
}