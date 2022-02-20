package Constuctor;

public class Student1 
{
	String name;
	
	Student1(String name)
	{
		this.name = name;
	}
	
	Student1(){
		this.name = "Unknown";
	}
	
	public static void main(String[] args) 
	{
		Student1 s1 = new Student1();
		Student1 s2 = new Student1("ANUJA ZOPE");
		
		System.out.println(s1.name);
		System.out.println(s2.name);
				
	}
	
}
