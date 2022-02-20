package classandobject;

public class AccountHolderMin 
{
	int age;
	float accountbalance;
	String name;
	
	static int minandage = 25;
	static float minacbal = 20000;
	
	AccountHolderMin(String name,int age,float accountbalance)
	{
		this.name = name;
		this.age = age;
		this.accountbalance = accountbalance;
	}
	
	void testEligibilityForCC()
	{
		if(age >=minandage && accountbalance >= minacbal)
		{		
			System.out.println(name+" is Eligible for credit card.");
		}
		else 
		{
			System.out.println(name+" is Not Eligible for credit card.");
		}
	}
	
	public static void main(String[] args) 
	{
		AccountHolderMin tom = new AccountHolderMin("Tom", 22, 50000);
		AccountHolderMin henry = new AccountHolderMin("Henry", 27, 24500);
		AccountHolderMin sarah = new AccountHolderMin("Sarah", 26, 25000);
		
		AccountHolderMin.minandage = 22;
		AccountHolderMin.minacbal = 25000;

		tom.testEligibilityForCC();
		
		henry.testEligibilityForCC();
		sarah.testEligibilityForCC();		
	}
}