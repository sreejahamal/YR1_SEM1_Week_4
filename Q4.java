import java.util.Scanner;
/**
 * Write a description of class Q4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q4
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:");
        int num=sc.nextInt();
        
        if (num%3==0 && num%5==0){
            System.out.println("The number is divisible by both 3 and 5");
        }
        else if (num%3==0){
            System.out.println("The number is divisible by 3 but not 5");
        }
        else if (num%5==0){
            System.out.println("The number is divisible by 5 but not 3");
        }
        else{
            System.out.println("The number is not divisible by both 3 and 5");
        }
        
    }
}