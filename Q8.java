import java.util.Scanner;
/**
 * Write a description of class Q8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q8
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your GPA:");
        float gpa=sc.nextFloat();

        if (gpa < 0.0 || gpa > 4.0){
            System.out.println("Invalid GPA");
        }
        else{
            if (gpa >= 3.0 && gpa <= 4.0){
                System.out.println("GPA:A");
            }
            else if (gpa >= 2.0 && gpa < 3.0){
                System.out.println("GPA:B");
            }
            else if (gpa >= 1.0 && gpa < 2.0){
                System.out.println("GPA:C");
            }
            else if (gpa >= 0.0 && gpa < 1.0){
               System.out.println("GPA:D"); 
            }
        }
    }      
}   