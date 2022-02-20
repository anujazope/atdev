package arrays;
public class ArrayValue_P2
{
	public static void main(String[] args)
	{
		int [] arr = {3,15,60,200,205,1640,4408,5000};
		int n = 5000;
		boolean flag=false;
		for(int i :arr)
		{
			if(i==n) 
			{
				flag = true;
				break;
			}
		}
		System.out.println(flag);
	}
}