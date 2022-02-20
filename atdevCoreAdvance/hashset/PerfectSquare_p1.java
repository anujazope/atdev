package hashset;
import java.lang.Math;
public class PerfectSquare_p1
{
	static int findRemainingIndex(int N)
	{
		int ans = N;
		while(N>1)
		{
			int discard = (int)(Math.sqrt(N));
			if (discard * discard ==  N)
			{
				ans --;
			}
			N -= discard;
			
		}
		return ans;
	}
	static void findRemainingElement(int arr[], int N)
	{
		int remainingIndex = findRemainingIndex(N);
		System.out.print(arr[remainingIndex - 1]);
		
	}
	public static void main(String []args)
	{
		int arr[] = {2,3,4,5,6,7,8,9,10};
		int N = 9;
        findRemainingElement(arr,N);
	}
	}
