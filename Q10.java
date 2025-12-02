import java.util.Scanner;

/**
 * Write a description of class Q10 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q10
{
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Input the size of the paper");
        String size=sc.nextLine();
        
        switch(size){
            
            case "A0": 
                System.out.println("The size of the paper is 841 x 1189 mm (33.1 x 46.8 inches)");
            break;
            
            case "A1":
                System.out.println("The size of the paper is 594 x 841 mm (23.4 x 33.1 inches)");
            break;
            
            case "A2":
                System.out.println("The size of the paper is 420 x 594 mm (16.5 x 23.4 inches)");
            break;
            
            case "A3":
                System.out.println("The size of the paper is 297 x 420 mm (11.7 x 16.5 inches)");
            break;
            
            case "A4":
                System.out.println("The size of the paper is 210 x 297 mm (8.3 x 11.7 inches)");
            break;
            
            case "A5":
                System.out.println("The size of the paper is 148 x 210 mm (5.8 x 8.3 inches)");
            break;
            
            default:
                System.out.println("Invalid paper size");
        }
    }
}   