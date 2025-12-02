import java.util.Scanner;

/**
 * Write a description of class Q11 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q11
{
    public static void main(String args[]){
        
    double tax_rate=0;
    int Total_tax=0;
    int tax=0;
    int left=0;
    
    int a=(int)(500000*0.01);
    int b=a + (int)(200000*0.1);
    int c=b + (int)(300000*0.2);
    int d=c + (int)(1000000*0.3);
    int e=d + (int)(3000000*0.36);
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your annual income:");
    int annual_income=sc.nextInt();
       
    if (annual_income>0 && annual_income<=500000){
        tax_rate=0.01;
        tax=(int)(tax_rate*annual_income);
        Total_tax=tax;
    }
    else if (annual_income<=700000){
        tax_rate=0.1;
        left=annual_income-500000;
        tax=(int)(tax_rate*left);
        Total_tax=a+tax;
    }
    else if(annual_income<=1000000){
        tax_rate=0.2;
        left=annual_income-700000;
        tax=(int)(left*tax_rate);
        Total_tax=b+tax;
    }
    else if(annual_income<=2000000){
        tax_rate=0.3;
        left=annual_income-1000000;
        tax=(int)(left*tax_rate);
        Total_tax=c+tax;
    }
    else if (annual_income<=5000000){
        tax_rate=0.36;
        left=annual_income-2000000;
        tax=(int)(left*tax_rate);
        Total_tax=d+tax;
    }
    else if (annual_income>5000000){
        tax_rate=0.39;
        left=annual_income-5000000;
        tax=(int)(left*tax_rate);
        Total_tax=e+tax;
    }
    else{
        System.out.println("Invalid Tax Input");
    }
    System.out.println("The total tax is:"+" "+Total_tax);
    }
}   