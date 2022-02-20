package arrays;
public class Max_p4
{
	public static void main(String[] args) 
	{
		int [] arr = {3,15,20,25,255,147,625,100};
		int min=arr[0],max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println("Min :"+min);
		System.out.println("Max :"+max);
	}
}
