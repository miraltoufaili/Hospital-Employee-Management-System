package domains;

public class Employee {
	
	private int iD;
	private String name;
	private String department;
	private boolean working;
	
	
	public Employee(int iD, String name, String department, boolean working) {
		super();
		this.iD = iD;
		this.name = name;
		this.department = department;
		this.working = working;
	}


	@Override
	public String toString() {
		return "Employee [iD=" + iD + ", name=" + name + ", department=" + department + ", working=" + working + "]";
	}
	
	

}
