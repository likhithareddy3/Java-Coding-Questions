/*
Print the following pattern
Pattern for N = 4

1
23
345
4567

*/

import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        
        int n=s.nextInt();
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+j-1);
            }
            
            System.out.println();
        }
		
		
		
	}

}




