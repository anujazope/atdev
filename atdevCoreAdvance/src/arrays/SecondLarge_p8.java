package arrays;
public class SecondLarge_p8
{
	public static void main(String[] args) 
	{
		int [] arr = {20,5,20,23,25,17,23,23,40,95,5,5,5,20,98,2,20,900,970};
		int max=arr[0],secondmax=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				secondmax=max;
				max=arr[i];
			}
			if(secondmax<arr[i] && arr[i]<max) 
			{
				secondmax=arr[i];
			}
		}
		System.out.println("Second largest number : "+secondmax);
	}
}
