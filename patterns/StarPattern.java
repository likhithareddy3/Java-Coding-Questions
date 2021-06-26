/*Print the following pattern
Pattern for N = 4
   *
  ***
 *****
******* 

The dots represent spaces. */


import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		int temp=1;
		
		for(int i=1;i<=n;i++)
		{
				for(int space=0;space<n-i;space++)
				{
					System.out.print(" ");
				}
				
			for(int j=1;j<=(i*2-1);j++)
			{
				System.out.print("*");
			}
				
			
			
			System.out.println();
			
		}

		
	}

}