package loops1;
public class Difference
{
	static int diff21(int n)
	{
		if(n>21) 
		{
			  return (n-21)*2;
		}
		   else 
		{
			return 21-n;
		}
	}
	public static void main(String[] args)
	{
		System.out.println(diff21(19));
		System.out.println(diff21(10));
		System.out.println(diff21(21));
	}
}