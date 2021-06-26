// Given a number N, find its square root. You need to find and print only the integral part of square root of N.
// For eg. if number given is 18, answer is 4.

import java.util.Scanner;
import java.lang.Math;
public class Main {
	
	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        int n=s.nextInt();
        
        int sqrt= (int)(Math.sqrt(n));
        
        System.out.println(sqrt);
	}
}