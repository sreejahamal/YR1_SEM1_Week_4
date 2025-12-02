import java.util.Scanner;

/**
 * Write a description of class Q1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q1
{
     public static void main(String args[])
     {
         int passGrade=40;
         
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter your grade:");
         int grade=sc.nextInt();
         
         if(grade>=passGrade)
         {
             System.out.println("Pass");
         }
         else{
             System.out.println("Fail");
         }
     }
}