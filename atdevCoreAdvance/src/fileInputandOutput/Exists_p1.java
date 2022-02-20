package fileInputandOutput;
import java.io.File;

public class Exists_p1
{
	public static void main(String[] args) 
	{
		File f = new File("C:\\Users\\Dell\\eclipse-workspace");
				
		if(f.exists()) 
		{
			System.out.println("Given File Or Directory Is Present");
		}
		else System.out.println("Given File Or Directory Is Not Present");		
	}
}
