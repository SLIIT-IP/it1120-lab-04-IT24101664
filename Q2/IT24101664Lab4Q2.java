import java.util.Scanner;

public class IT24101664Lab4Q2{
  public static void main (String[] args){

 
   float exammark,labmark,perexam,perlab,finalmark;

   Scanner input = new Scanner (System.in);
    
   System.out.print("Please enter exam marks (out of 100): ");
   exammark = input.nextFloat();
   
   System.out.print("Please enter lab submission marks (out of 100): ");
   labmark = input.nextFloat();



   if(exammark>=0 && exammark<=100 && labmark>=0 && labmark<=100)
   {

   System.out.print("Please enter the precentage given for the exam: ");
   perexam = input.nextFloat();
   
   System.out.print("Please enter the precentage given for the lab submission: ");
   perlab = input.nextFloat();
    
    if(perexam+perlab==100)
     {
      finalmark = exammark*perexam/100 + labmark*perlab/100;
      System.out.print("Final exam mark is: " +finalmark);
     }
     else
     {
      System.out.print("The percentages must add up to 100. Terminating program.");
     }

   }
   else
   {
    System.out.print("Invalid input for marks. Teminating program.");
   }

  }

}