package fileInputandOutput;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadLine_p7
{
	public static void main(String[] args) throws IOException 
	{
		File f = new File("./anu1.txt");
			if(!f.exists()) f.createNewFile();
		FileReader fr = new FileReader(f);		
		BufferedReader br = new BufferedReader(fr);
		String str;
		while((str =br.readLine()) != null) 
		{
			System.out.println(str);
		}
		
		br.close();
		fr.close();
	}
}
