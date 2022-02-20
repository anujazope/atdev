package fileInputandOutput;
import java.io.File;
import java.util.Date;

public class LastFile_p3
{
	public static void main(String[] args)
	{
		File f = new File("C:\\Users\\Dell\\eclipse-workspace\\FirstProgram\\src");
		System.out.println("Last modified date fo the given file : "+new Date(f.lastModified()));
	}
}
