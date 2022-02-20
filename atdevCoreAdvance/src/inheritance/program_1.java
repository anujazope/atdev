
//Below written the code is showing compile time error. Can you identify what mistake ?
package inheritance;
public class program_1
class X

{

    //Class X Members

}

 class Y

{

    //Class Y Members

}

 class Z extends X,Y

{

    //Class Z Members

}
 
 ///////////  ANS   //////////////////////
 //  in java a class can not extend more than one class. class z is extending two classes that is class x and class y.
 //   it is a compile time error in java.