/*Write a program to calculate the total salary of a person. The user has to enter the basic salary (an integer) and the grade (an uppercase character), and depending upon which the total salary is calculated as -
    totalSalary = basic + hra + da + allow – pf
where :
hra   = 20% of basic
da    = 50% of basic
allow = 1700 if grade = ‘A’
allow = 1500 if grade = ‘B’
allow = 1300 if grade = ‘C' or any other character
pf    = 11% of basic.
Round off the total salary and then print the integral part only*/

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
       Scanner s=new Scanner(System.in);
        
        int basic=s.nextInt();
        String str=s.next();
        char grade=str.charAt(0);
        
        double hra=0.20*basic;
        double da=0.50*basic;
        double pf=0.11*basic;
        
        
        if(grade=='A')
        {
            double total=basic+hra+da+1700-pf;
            System.out.println(Math.round(total));
        
            
        }
        
        else if(grade=='B')
        {
          double total=basic+hra+da+1500-pf;
          System.out.println(Math.round(total));
          
        }
        
        else
        {
            double total=basic+hra+da+1300-pf;
            System.out.println(Math.round(total));
        }
        
        

	}
}
