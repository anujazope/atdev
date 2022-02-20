package string;
public class Repeatation_p8 
{
	static String repeat(String str,int n)
	{
		String s="";
		for(int i=0;i<n;i++) 
		{
			s+=str.substring(str.length()-n);
		}
		
		return s;
	}
	public static void main(String[] args)
	{
		System.out.println(repeat("Hello",3));
		System.out.println(repeat("Hello",2));
		System.out.println(repeat("Hello",1));
	}
}
