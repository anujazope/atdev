//2.What is wrong with the below code? Why it is showing compile time error?

package inheritance;
public class A

{

    public A()

    {

        System.out.println(1);

         super(); 

        System.out.println(2);

    }

}

////////////// answer /////////////
///   constucor calling statements (super() or this()), if written must be the first statements in the constructor. 
/// correct code is :
//        package inheritance;
//        public class A
//      {
//           public A()
//           {
//        	   super();
//       	      System.out.println(1);
//        	      System.out.println(2);
//        	   
//           }

