package collection;

public class Exercise1 implements Comparable<Exercise1>  {

	 private int id;
	 private String name;
	 private int age;
	 
	 public Exercise1(int id, String name, int age) {
	  super();
	  this.id = id;
	  this.name = name;
	  this.age = age;
	 }
	 
	 public int getId() {
	  return id;
	 }
	 
	 public void setId(int id) {
	  this.id = id;
	 }
	 
	 public String getName() {
	  return name;
	 }
	 
	 public void setName(String name) {
	  this.name = name;
	 }
	 
	 public int getAge() {
	  return age;
	 }
	 
	 public void setAge(int age) {
	  this.age = age;
	 }
	 
	 public int compareTo(Exercise1 o) {
	   
	  return this.getName().compareTo(o.getName());
	}
	  
	 
	 public String toString() {
	   return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	  }
	 
	}