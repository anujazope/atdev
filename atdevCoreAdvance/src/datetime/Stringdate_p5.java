package datetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Stringdate_p5
{
	public static void main(String[] args) throws ParseException 
	{
		Date d = (new SimpleDateFormat("dd/mm/yyyy hh:mm:ss")).parse("05/06/2005 05:31:30");
		System.out.println(d);

		System.out.println(d);
	}
}
