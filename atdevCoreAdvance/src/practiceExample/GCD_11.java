package practiceExample;
 import java.util.Scanner;  
public class GCD_11
{
	   public static void main(String[] args)    
	    {
	       
		    Scanner sc = new Scanner(System.in);  
		   System.out.println("Enter the two numbers: ");  
		   int n1 = sc.nextInt();  
		   int n2 = sc.nextInt();  
		   System.out.println("The GCD of two numbers is: " + findGCD(n1,n2));  
		   }  
		   static int findGCD(int n1, int n2)  
		   {  
		   int r=0, a, b;  
		   a = (n1 > n2) ? n1 : n2; // a is greater number  
		   b = (n1 < n2) ? n1 : n2; // b is smaller number  
		   r = b;  
		   while(a % b != 0)  
		   {  
		   r = a % b;  
		   a = b;  
		   b = r;  
		   }  
		   return r;  
		   }  
		   }