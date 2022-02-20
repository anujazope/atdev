package collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;


public class CustomEmployeeSortByName {

	public static void main(String[] args) {
		 List<Exercise1> emps = new ArrayList<>();
		 
		  emps.add(new Exercise1(1999, "anuja", 59));
		  emps.add(new Exercise1(1908, "priya", 108));
		  emps.add(new Exercise1(1950, "sakshi", 96));
		 
		  System.out.println("Before sorting list of employees : ");
		  Iterator<Exercise1> it = emps.iterator();
		  while (it.hasNext()) {
			  System.out.println(it.next());
		  }
		  Collections.sort(emps);
		 
		  System.out.println("After sorting list of employees : ");
		  it = emps.iterator();
		  while (it.hasNext()) {
		   System.out.println(it.next());
		  }
		 
		  Collections.sort(emps, Collections.reverseOrder());
		
		 }
		 
		}
