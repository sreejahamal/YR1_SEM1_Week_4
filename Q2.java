import java.util.Scanner;

/**
 * Write a description of class Q2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q2
{
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:");
        int num=sc.nextInt();
        
        if (num%2==0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }
        
    }
}