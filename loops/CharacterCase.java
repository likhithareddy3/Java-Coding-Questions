/*Write a program that takes a character as input and prints either 1, 0 or -1 according to the following rules.
1, if the character is an uppercase alphabet (A - Z)
0, if the character is a lowercase alphabet (a - z)
-1, if the character is not an alphabet */

import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        
        String str=s.nextLine();
        
        char a=str.charAt(0);
        
        int b=(int)a;
        
        if(b>=65 && b<=90)
        {
            System.out.println("1");
        }
        
        else if(b>=97 && b<=122)
        {
            System.out.println("0");
            
        }
        else{
            System.out.println("-1");
        }
        

    }
}