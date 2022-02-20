package fileInputandOutput;


import java.io.File;

public class CheckDirectory_p2
{
	public static void main(String[] args) 
	{
		File f = new File("C:\\Users\\Dell\\eclipse-workspace");
		
		System.out.println(f.isDirectory()?"Directory":"File");
	}
}
