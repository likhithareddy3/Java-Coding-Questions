/*Print the following pattern
Pattern for N = 4

 . . . 1
 . . 2 3
 . 3 4 5
 4 5 6 7

The dots represent spaces. */

import java.util.Scanner;

public class Solution {


	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
        
        int n=s.nextInt();
        
        for(int i=1;i<=n;i++)
        {
            for(int space=1;space<=n-i;space++)
            {
                System.out.print(" ");
            }
            
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+j-1);
            }
            
            System.out.println();
        }

		
	}

}
