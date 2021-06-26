// Write a Program to determine if the given number is Armstrong number or not. Print true if number is armstrong, otherwise print false.
// An Armstrong number is a number (with digits n) such that the sum of its digits raised to nth power is equal to the number itself.

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        int n=s.nextInt();
        int count=0;
        int ams=0;
        int temp=n;
        int temp1=n;
        
        while(temp>0)
        {
            int r=temp%10;
            count=count+1;
            temp=temp/10;
        }

        while(temp1>0)
        {
            
            int rem=temp1%10;
            ams=ams+(int)Math.pow(rem,count);
                
            temp1=temp1/10;
            
        }
        if(ams==n)
        {
            
            System.out.println("true");
        }
        
        else{
            System.out.println("false");
        }

	}
}