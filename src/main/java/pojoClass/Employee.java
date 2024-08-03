package pojoClass;

public class Employee {
	
	String name;
	int empid;
	long []phone;
	Spouse sp;
	
	public Employee(String name, int empid, long []phone, Spouse sp) {
		this.name=name;
		this.empid=empid;
		this.phone=phone;
		this.sp=sp;
	}
	
	public Employee() {
		
	}
	
	public String getName() {
		return name;
	}
	
	public int getEmpid() {
		return empid;
	}
	public long[] getPhone() {
		return phone;
	}
	public Spouse getSp() {
		return sp;
	}

}
