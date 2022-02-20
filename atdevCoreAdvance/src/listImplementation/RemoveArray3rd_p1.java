package listImplementation;
import java.util.*;
public class RemoveArray3rd_p1
{
public static void main(String[] args) {

List<String> list_Strings = new ArrayList<String>();
list_Strings.add("Anuja");
list_Strings.add("Gunashri");
list_Strings.add("pooja");
list_Strings.add("yogita");
list_Strings.add("snehal");

System.out.println(list_Strings);

list_Strings.remove(2);
System.out.println("After removing third element from the list:\n"+list_Strings);
}
}