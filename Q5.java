import java.util.Scanner;
/**
 * Write a description of class Q5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q5
{
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:");
        int num=sc.nextInt();
        
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("The number is divisible by both 3 and 5");
        }
        else if (num % 3 == 0) {
            System.out.println("The number is divisible by 3 but not 5");
        }
        else if (num % 5 == 0) {
            System.out.println("The number is divisible by 5 but not 3");
        }
        else {
            System.out.println("The number is neither divisible by 5 nor 3");
        }
    }
}   