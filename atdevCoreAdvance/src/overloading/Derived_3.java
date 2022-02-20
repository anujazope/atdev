package overloading;
public class Derived_3

{ 

	public void getDetails(String temp) 

	{ 

		System.out.println("Derived class " + temp); 

	} 

} 



public class Test extends Derived 

{ 

	public int getDetails(String temp) 

	{ 

		System.out.println("Test class " + temp); 

		return 0; 

	} 

	public static void main(String[] args) 

	{ 

		Test obj = new Test(); 

		obj.getDetails("GFG"); 

	} 


}


/////////   answer 
//         the overriding method can not have more restrictive access modifier.