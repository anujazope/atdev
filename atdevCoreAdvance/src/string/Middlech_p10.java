package string;
public class Middlech_p10
{
	static String middle(String str) 
	{
		return str.substring((str.length()/2)-1, (str.length()/2)+1);
	}
	public static void main(String[] args)
	{
		System.out.println(middle("string"));
		System.out.println(middle("code"));
		System.out.println(middle("Practice"));
	}
}
