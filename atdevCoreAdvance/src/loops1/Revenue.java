package loops1;

import java.util.Scanner;

public class Revenue 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter Unit Price : ");
		int price = in.nextInt();
		
		System.out.println("\nEnter Quantity :");
		int q = in.nextInt();
		
		int d = 0;//d=discount and q=quantity
		if(q>=100) 
		{
			d=10;
		}
		if(q>120) 
		{
			d = 15;
		}
		
		System.out.println("The revenue from sale: "+((float)(q*price)-((q*price)*d)/100)+"$");
		System.out.println("After discount: "+((float)((q*price)*d)/100)+"$("+(float)d+"%)");
	}
}
