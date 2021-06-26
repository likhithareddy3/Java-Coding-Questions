//Write a program to input an integer N and print the sum of all its even digits and sum of all its odd digits separately.
//Digits mean numbers, not the places! That is, if the given integer is "13245", even digits are 2 & 4 and odd digits are 1, 3 & 5.


import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
        Scanner s=new Scanner(System.in);
	        
	        int n=s.nextInt();
	        
	        int evenSum=0,oddSum=0;
	        
	        while(n>0)
	        {
	            int digit=n%10;
	            
	            if(digit%2==0)
	            {
	                evenSum=evenSum+digit;
	            }
	            
	            else{
	                 oddSum=oddSum+digit;
	            }
	            
	            n=n/10;
	            
	        }
	        
	        System.out.println(evenSum+" "+oddSum);

	}
}
