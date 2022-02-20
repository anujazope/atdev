package datetime;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class DayOfWeek_p4
{
	public static void main(String[] args) 
	{
		GregorianCalendar g = new GregorianCalendar(2021,01,21);
		System.out.println(new SimpleDateFormat("EEEE").format(g.getTime()));
	}
}
