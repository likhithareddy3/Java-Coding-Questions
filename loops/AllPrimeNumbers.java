//Given an integer N, print all the prime numbers that lie in the range 2 to N (both inclusive).
//Print the prime numbers in different lines.

import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
        
        int n=s.nextInt();

        for(int i=1;i<=n;i++)
        {
        	int count=0;
        	
        	for(int j=1;j<=i;j++)
        	{
        		if(i%j==0)
        		{
        			count=count+1;
        		}
  
        	}
        	
        	if(count==2)
        	{
        		System.out.println(i);
        	}
	
        }
	
	}
}
