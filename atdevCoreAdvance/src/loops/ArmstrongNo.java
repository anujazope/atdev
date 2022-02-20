package loops;

public class ArmstrongNo
{
	int x;
	int Armstrong(int no,int a)
	{
	if(no!=0)
	{
		x=no%10;
		a=a+(x*x*x);
		no/=10 ;
		return Armstrong(no,a);
	}
	return a;
	}
	public static void main(String[] arg)
	{
	ArmstrongNo A=new ArmstrongNo();
	int arm;
	System.out.println("Armstrong numbers between 1 to 500");
	for(int num=1;num<500;num++)
	{
	arm=A.Armstrong(num,0);
	if(arm==num)
	      System.out.println(num);
	}
	}
}