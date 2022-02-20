package methods;
import java.util.Scanner;
public class SmalleThree_p1
{
	public static float smallestThree(float a,float b,float c)
	{
		return (a<b?a:b)<c?(a<b?a:b):c;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input the first number : ");
		float a = sc.nextFloat();
		System.out.print("Input the second number : ");
		float b = sc.nextFloat();
		System.out.print("Input the third number : ");
		float c = sc.nextFloat();
		
		System.out.println("The smallest value is "+smallestThree(a, b, c));
	}
}
