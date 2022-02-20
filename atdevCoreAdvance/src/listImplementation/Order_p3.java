package listImplementation;
import java.util.ArrayList;
public class Order_p3
{
  public static void main(String[] args) 
  {
ArrayList <String> c1 = new ArrayList <String> ();
c1.add("Rose");
c1.add("lily");
c1.add("lotus");
c1.add("sunflower");
c1.add("jasmine");
c1.add("hibiscus");
System.out.println("\nOriginal array list: " + c1);
System.out.println("\nPrint using index of an element: ");
int no_of_elements = c1.size();
for (int index = 0; index < no_of_elements; index++)
 System.out.println(c1.get(index));
}
}