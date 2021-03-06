package hashset;
import java.util.*;

public class HashsetToArraylistConvert_p2
{
public static void main(String[] args) {
       // Create a empty hash set
   HashSet<String> h_set = new HashSet<String>();
 // use add() method to add values in the hash set
        h_set.add("Orange");
        h_set.add("Strawberry");
        h_set.add("Pineapple");
        h_set.add("Apple");
        h_set.add("guava");
        h_set.add("Mango");
    System.out.println("Original Hash Set: " + h_set);
  
  // Create a List from HashSet elements
   List<String> list = new ArrayList<String>(h_set);

   // Display ArrayList elements
   System.out.println("ArrayList contains: "+ list);
}
}