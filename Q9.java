import java.util.Scanner;

/**
 * Write a description of class Q9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q9
{
    public static void main(String args[]){
        
        Boolean flag=false;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter GPA:");
        double gpa=sc.nextDouble();
        System.out.println("Enter attitude:");
        int attitude=sc.nextInt();
        System.out.println("Enter attendance(%):");
        int attendance=sc.nextInt();
        
        
        if (gpa < 0.0 || gpa > 4.0){
            System.out.println("Invalid data, enter again");
        }
        else if(attitude<0 || attitude>10){
            System.out.println("Invalid data, enter again");
        }
        else if(attendance<0 || attendance>100){
            System.out.println("Invalid data, enter again");
        }
        else{
            flag=true; 
        }
        
        if (flag==true){ //if (flag){}
            
            if (gpa>=3.2){
                
                if  (attendance>=80){
                    
                    if (attitude<5){
                        System.out.println("Eligible for scholarship");
                    }
                    else{
                        System.out.println("Not eligible for scholarship");  
                    }
                }
                else{
                    System.out.println("Not eligible for scholarship");
                }
            }
            else{ 
                System.out.println("Not eligible for scholarship");
            }
        }  
    }
}




