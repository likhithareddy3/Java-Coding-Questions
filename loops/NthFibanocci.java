/*Nth term of Fibonacci series F(n), where F(n) is a function, is calculated using the following formula -
    F(n) = F(n-1) + F(n-2), 
    Where, F(1) = F(2) = 1
Provided N you have to find out the Nth Fibonacci Number */

import java.util.Scanner;

public class Solution {


	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
        
        int n=s.nextInt();
        
        int a=1,b=1;
        int c=0;
        
        if(n==1 || n==2)
        {
            System.out.println("1");
            return;
        }
        
        for(int i=3;i<=n;i++)
        {
            c=a+b;
            a=b;
            b=c;
        }
        
        System.out.println(c);

		
	}

}