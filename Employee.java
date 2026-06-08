package homework;

public class Employee extends Person {
	//data
	protected double salary;
	protected String office;
	protected java.util.Date datehired;
	
	public Employee() {
		
	}
	public Employee(String newname, String address, String phone, String email, double salary, String office) {
		super(newname, address, phone, email);
		this.salary = salary;
		this.office = office;
		datehired = new java.util.Date();
	}
	
	public String toString() {
		return super.toString() + 
               "\nClass: Employee" +
			   "\nsalary: " + salary +
			   "\noffice: " + office +
			   "\nhire date: " + datehired;
	}

}
