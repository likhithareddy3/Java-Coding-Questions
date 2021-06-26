//Given a binary number as an integer N, convert it into decimal and print.

import java.lang.Math;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        
        int n=s.nextInt();
        int count=0;
        int dec=0;
        
        while(n>0)
        {
            int r=n%10;
            
            dec+=r*Math.pow(2,count++);
            n=n/10;
            
        }
        
        System.out.println(dec);

	}
}