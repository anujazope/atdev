package Constuctor;

public class AddAmountp3 
{
	static float amount = 50;
	AddAmountp3() 
	{
		amount += 0;
	} 
	
	AddAmountp3(float amount)
	{
		AddAmountp3.amount += amount;
	}
	
	public static void main(String[] args) 
	{
		AddAmountp3 addamount = new AddAmountp3();
		AddAmountp3 addamount1 = new AddAmountp3(10);
		
		System.out.println(AddAmountp3.amount);
		
	}
}
