import java.util.Scanner;

public class IT24101664Lab4Q1{

      public static void main(String[] args){
 
      Scanner input=new Scanner(System.in);


double number;
 System.out.println("Enter the number");
 number=input.nextDouble();

if(number>0){
System.out.println("Positive");}
else if(number<0){
System.out.println("Negative");}
else
{System.out.print("number is zero");}

}
}