package overloading;
public class Derived 

{ 

	protected void getDetails() 

	{ 

		System.out.println("Derived class"); 

	} 

} 



public class Test extends Derived 

{ 

	protected final void getDetails() 

	{ 

		System.out.println("Test class"); 

	} 

	public static void main(String[] args) 

	{ 

		Derived obj = new Derived(); 

		obj.getDetails(); 

	} 


}

///    answer  
//     having compilation error.
//     final and static methods cannot be overriden 