package listImplementation;
import java.util.*;
public class CopyOneToAnother_p2
{
public static void main(String[] args)
{
List<String> List1 = new ArrayList<String>();
List1.add("anu");
List1.add("sonu");
List1.add("tau");
List1.add("kartu");
System.out.println("List1: " + List1);
List<String> List2 = new ArrayList<String>();
List2.add("50");
List2.add("49");
List2.add("80");
List2.add("90");
System.out.println("List2: " + List2);

Collections.copy(List1, List2);
System.out.println("Copy List to List2,\nAfter copy:");
System.out.println("List1: " + List1);
System.out.println("List2: " + List2);
}
}