import java.util.Scanner;
/**
 * Write a description of class Q3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q3
{
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:");
        int num=sc.nextInt();
        
        if (num>0){
            System.out.println("The number is positive");
        }
    
        else if (num<0){
            System.out.println("The number is negative");
        }
        
        else{
            System.out.println("The number is zero");
        }
        
    }
}