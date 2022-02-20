package overloading;
import java.io.IOException; 



class Derived_4 

{ 

	public void getDetails() throws IOException //line 23 

	{ 

		System.out.println("Derived class"); 

	} 

} 



public class Test extends Derived 

{ 

	public void getDetails() throws Exception //line 24 

	{ 

		System.out.println("Test class"); 

	} 

	public static void main(String[] args) throws IOException //line 25 

	{ 

		Derived obj = new Test(); 

		obj.getDetails(); 

	} 


}

//       answer
//       compilation error in line no 24
//       the exception thrown by the overriding method should not be new or more broader checked exception. 
//       in code  exception is more broader class of checked exception than IOException so this results in compilation error.