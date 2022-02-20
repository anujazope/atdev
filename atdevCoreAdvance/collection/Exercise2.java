package collection;

public class Exercise2 implements Comparable<Exercise2>{
	 private int Deptid;
	 private String Deptname;
	 
	 public Exercise2(int Deptid, String Deptname) {
	  super();
	  this.Deptid = Deptid;
	  this.Deptname = Deptname;
	  
	 }
	 
	 public int getDeptid() {
	  return Deptid;
	 }
	 
	 public void setDeptid(int Deptid) {
	  this.Deptid = Deptid;
	 }
	 
	 public String getDeptname() {
	  return Deptname;
	 }
	 
	 public void setDeptname(String Deptname) {
	  this.Deptname = Deptname;
	 }
	 
	 
	 
	 public int compareTo(Exercise2 o) {
	   
	  return this.getDeptname().compareTo(o.getDeptname());
	}
	  
	 
	 public String toString() {
	   return "Employee [Deptid=" + Deptid + ", Deptname=" + Deptname + "]";
	  }
	 
	}