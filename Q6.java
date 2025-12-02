import java.util.Scanner;

/**
 * Write a description of class Q6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q6
{
    public static void main(String args[]){
        double sp=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marked price:");
        double mp=sc.nextInt();
        
        System.out.println("Enter the category:");
        char cgt=sc.next().charAt(0);
        
        if (cgt=='A'||cgt=='a'){
            sp=mp-(mp * 0.6);
            System.out.println("The selling price is:" + sp);
        }
        else if (cgt=='B'||cgt=='b'){
            sp=mp-(mp * 0.4);
            System.out.println("The selling price is:" + sp);
        }
        else if (cgt=='C'||cgt=='c'){
            sp=mp-(mp * 0.2);
            System.out.println("The selling price is:" + sp);
        }
        else if (cgt=='D'||cgt=='d'){
            sp=mp-(mp * 0.1);
            System.out.println("The selling price is:" + sp);
        }
        else{
            System.out.println("The selling price is:" + mp);
        }
    }
}   