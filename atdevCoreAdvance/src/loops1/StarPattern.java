package loops1;
public class StarPattern
{   
public static void main(String args[])   
{   
   int i, j, row=5;   
   for(i=0; i<row; i++)   //outer row
	   
   {   
 
for(j=0; j<=i; j++)  //inner column
{   
  
System.out.print("*");
}   

System.out.println();   
}   
}   
}