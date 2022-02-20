package overloading;
public class Derived_1

{ 

	public void getDetails(String temp) 

	{ 

		System.out.println("Derived class " + temp); 

	} 

} 



public class Test extends Derived_1

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


///       answer
//        it is having compilation error
//         the overriding method must have same signature, which includes,the argument list and the return type.