package string;
public class Prefixstr_9
{
	static boolean prefix(String str,int n) 
	{
		return str.substring(n).contains(str.substring(0, n));
	}
	public static void main(String[] args) 
	{
		System.out.println(prefix("abXYabc", 1));
		System.out.println(prefix("abXYabc", 2));
		System.out.println(prefix("abXYabc", 3));
	}
}
