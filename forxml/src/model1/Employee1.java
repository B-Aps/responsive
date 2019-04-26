package model1;

public class Employee1 {
	
	public Employee1()
	{
		
	}
public Employee1(String empid, String ename, String address) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.address = address;
	}
public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
String empid;
String ename;
String address;

}
