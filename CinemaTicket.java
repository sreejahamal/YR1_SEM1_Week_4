import java.util.Scanner;

/**
 * Write a description of class CinemaTicket here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CinemaTicket
{
    public static void main(String args[]){
        
        int price=0;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter your age:");
        int age=sc.nextInt();
        sc.nextLine(); 
        
        System.out.println("Enter the language of the movie:");
        String lng=sc.nextLine();
        
        System.out.println("Are you a student and do you have studentID? (Type 'yes' or 'no'");
        String stnd=sc.nextLine();
        
        System.out.println("Is there a festival going on? (Type 'yes' or 'no'");
        String fes=sc.nextLine();
        
        Boolean student=(stnd.equals("yes") || stnd.equals("Yes")); 
        Boolean festival=(fes.equals("yes") || fes.equals("Yes")); 
        
        if (age>0 && age<=18){
            System.out.println("You are a Child");
            price = price + 150;
        }
        else if (age>18 && age<60){
            System.out.println("You are a Adult");
            price = price +250;
        }
        else{
            System.out.println("You are a Senior");
            price = price + 200;
        }
        
        if (lng.equals("Hindi")||lng.equals("hindi")){ 
            price = price + 50;
            System.out.println("Language Surcharge was Added");
        }
        else if (lng.equals("English")||lng.equals("english")){ 
            price = price + 100;
            System.out.println("Language Surcharge was Added");
        }
        else{
            System.out.println("No Language surcharge was added");
        }
        
        if (student==true){
            price = price - ((int)(0.2*price));
        }
        else{
            price = price + 0;
        }
        
        if (festival==true){
            price = price - ((int)(0.15*price));
        }
        else{
            price = price + 0;
        }
        
        System.out.println("Finally,Your total charge is: "+price);
    }
}   