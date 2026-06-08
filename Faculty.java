package homework;

public class Faculty extends Person{

	//data
	protected String office_hours;
	protected String rank;
	
	//methods
	public Faculty() {
		
	}
	
	public Faculty(String newname, String address, String phone, String email, String office_hours, String rank) {
		super(newname, address, phone, email);
		this.office_hours = office_hours;
		this.rank = rank;
	}
	
	public String toString() {
		return super.toString() + 
               "\nClass: Faculty" +
			   "\noffice hours: " + office_hours +
			   "\nrank: " + rank;
	}
	
}
