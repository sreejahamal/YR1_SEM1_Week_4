import java.util.Scanner;
/**
 * Write a description of class Q7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q7
{
    public static void main(String args[]){
        
        double sp=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marked price:");
        double mp=sc.nextInt();
        
        System.out.println("Enter the category:");
        char cgt=sc.next().charAt(0);
        switch(cgt){
            case 'A':
            case 'a':
                sp=mp-(mp * 0.6);
                System.out.println("The selling price is:" + (sp));
                break;
            
            case 'B':
            case 'b':
                sp=mp-(mp * 0.4);
                System.out.println("The selling price is:" + (sp));
                break;
            
            case 'C':
            case 'c':
                sp=mp-(mp * 0.2);
                System.out.println("The selling price is:" + (sp));
                break;
            
            case 'D':
            case 'd':
                sp=mp-(mp * 0.1);
                System.out.println("The selling price is:" + (sp));
                break;
            
            default:
                System.out.println("The selling price is:" + (mp));
        }
    }
}   