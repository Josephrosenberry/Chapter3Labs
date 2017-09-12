import java.util.Scanner;
public class Main{
  public static void main (String [] args){
    String grade;
    Scanner scan = new Scanner (System.in);
    System.out.print ("Enter your grade: (Q to quit): ");
     grade = scan.nextLine();
     int numGrades = 0;
     int numA = 0, numB = 0, numC = 0, numD = 0, numF = 0;
    grade = grade.toUpperCase();
    
    
    while (!grade.equals("Q")){
     if (grade.equals("A")){
       System.out.println("Excellent!");
       numA++;
     }
       
      else if (grade.equals("B")) {
        System.out.println("Good!");
        numB++;
      }
        
      else if (grade.equals("C")){
        System.out.println("Poor");
        numC++;
      }
        
      else if (grade.equals("D")){
        System.out.println("Poor");
        numD++;
        }
        
      else if (grade.equals("F")){
        System.out.println("Failure");
        numF++;
      }
        
      else
        System.out.println("Invalid Grade Entered");
        
      System.out.println ("Enter your grade: (Q to quit): ");
      grade = scan.next();
      grade = grade.toUpperCase();
    }  
      double gpa = (numA*4.0 + numB*3.0 + numC*2.0 + numD*1.0)/(numA + numB + numC + numD + numF);
      System.out.printf("\n\nGPA: %.2f", gpa);
      System.out.println(" Goodbye!");
  }
}