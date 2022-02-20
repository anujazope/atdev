package practiceExample;
import java.util.Scanner;
public class DoubleVariable_10
{
    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Input the 1st number");
			double x = sc.nextDouble();
			System.out.println("Input the 2nd number");
			double y = sc.nextDouble();
			if ((x>0.0 && x < 1.0) && (y>1 && y < 100))
			{
			    System.out.println("false");
			}
			else
			{
			    System.out.println("variable");
			}
		}
    }
}