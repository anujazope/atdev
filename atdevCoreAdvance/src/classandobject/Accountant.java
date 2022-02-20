package classandobject;

public class Accountant
{
	String name;
	String emailid;
	String contactNo;
	
	Accountant(String name,String email,String mob)
	{
		this.name = name;
		this.emailid = emailid;
		this.contactNo = mob;
	}
	
	void viewAccountInfo() 
	{
		System.out.println("Accountant "+this.name+" has mail id"+this.emailid+" and contact No "+this.contactNo);
	}
	
	public static void main(String[] args) 
	{
		Accountant a1 = new Accountant("Anuja","anu@gmail.com","8755625395");
		Accountant a2 = new Accountant("kartik","kartu@gmail.com","8545965888");
			
		
		a1.viewAccountInfo();
		a2.viewAccountInfo();
	}
}
