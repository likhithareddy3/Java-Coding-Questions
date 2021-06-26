//Write a program to print first x terms of the series 3N + 2 which are not multiples of 4.

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
        
        Scanner s=new Scanner(System.in);
        
        int n=s.nextInt();
        String apterms="";
        
        for(int i=1;i<=n;i++)
        {
            int ap=3*i+2;
            if(ap%4==0)
            {
                n=n+1;
                continue;
            }
            
            apterms=apterms+ap+" ";
        }
        
        System.out.println(apterms);

	}
}
