package listImplementation;
import java.util.LinkedList;
public class AddFirstLat_p5
{
public static void main(String[] args)
{
   LinkedList<String> l_list = new LinkedList<String>();
 
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("white");
        l_list.add("Black");
        l_list.add("Yellow");
   System.out.println("Original linked list:" + l_list);    
 
  l_list.addFirst("Pink");
  l_list.addLast("Blue");
   System.out.println("Final linked list:" + l_list);  
}
}
