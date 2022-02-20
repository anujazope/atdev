package Characters;
import java.util.Scanner;
public class ChToUpper
{
 
	public static void main(String[] args)
	{
    System.out.print("Enter an input:");
    Scanner s = new Scanner(System.in);
    char[] value = s.nextLine().toCharArray();
    s.close();
 
		for(char ch:value){
			char chUpper = Character.toUpperCase(ch);
		
			System.out.println("character "+ch +" Upper case is " +chUpper);
		}		
 
	}
 
}