//Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to print the answer.
//Note : For this question, you can assume that 0 raised to the power of 0 is 1

import java.util.Scanner;

public class Solution {
    
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        
        int x=s.nextInt();
        int n=s.nextInt();
        
        int count=n;
        int mul=1;
        
        if(n==0)
        {
            x=1;
        }
        
        while(count>0)
        {
            mul=mul*x;
            count--;
        }
        
        System.out.println(mul);
        
    }
}