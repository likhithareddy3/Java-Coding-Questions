//Given a number N, print sum of all even numbers from 1 to N 

import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
	Scanner s=new Scanner(System.in);
        
        int n=s.nextInt();
        int d=2;
        int sum=0;
        
        while(d<=n)
        {
              sum=sum+d;
            d=d+2;
                 
        }
        
        System.out.println(sum);
        
		
	}

}