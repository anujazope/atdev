package arrays;
public class EvenOdd_p9 
{
	
	public static void main(String[] args) 
	{
		int [] arr = {4,5,20,23,25,17,23,23,40,95,5,5,5,20,98,2,20,900,970};
		int even=0;
		int odd=0;
		for(int i:arr)
		{
			if(i%2==0) even++;
			else odd++;
		}
		
		System.out.println("Even number in array :"+even+"\nOdd numbers in array :"+odd);
	}
}
