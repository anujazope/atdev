package arrays;

public class Reverse_p5
{
	public static void main(String[] args) 
	{
		int [] arr = {4,500,663,8455,9704,9998,1020};	
		for(int i = 0;i<arr.length/2;i++)
		{
			int tmp = arr[i];
			arr[i] = arr[arr.length-i-1];
			arr[arr.length-i-1]=tmp;
		}
		for(int  i:arr) 
		{
			System.out.print(i+" ");
		}
	}
}
