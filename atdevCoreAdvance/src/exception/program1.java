package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;


public class program1
{
public static void cat(File file)
{
    RandomAccessFile input = null;
    String line = null;

    try {
        input = new RandomAccessFile(file, "r");
        while ((line = input.readLine()) != null)
        {
            System.out.println(line);
        }
        return;
        
    }
    catch(FileNotFoundException fnf)
    {
    	System.err.format("File: %s not found%n",file);
    	
    }
     catch(IOException e)
    {
    	 System.out.println(e.toString());
    }
     finally
     {
        if (input != null)
        {
            input.close();
        } catch(IOException io) {
    }
}
}
}
