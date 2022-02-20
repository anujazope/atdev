package practiceExample;
import java.text.*;

import java.util.*;
public class CurrentTime_p7
{
	public static void main(String args[])
	{
		SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy   HH:mm:ss z");
		Date date = new Date();
		formatDate.setTimeZone(TimeZone.getTimeZone("IST"));
		System.out.println(formatDate.format(date));
		
	}
}
