// Given a decimal number (integer N), convert it into binary and print.
// The binary number should be in the form of an integer.

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
        Scanner s=new Scanner(System.in);
        
        int n=s.nextInt();
        long bin=0;
        int r=0;
        long i=1;
        
        while(n!=0)
        {
            r=n%2;
            n=n/2;
            bin=bin+r*i;
            i=i*10;
            
        }
            System.out.print(bin);

	}
}