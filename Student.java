package homework;

public class Student extends Person {
	
	final int freshman = 1;
	final int sophmore = 2;
	final int junior = 3;
	final int senior = 4;
	public int status;
	
	public Student() {
		
	}
	public Student(String newname, String address, String phone, String email, int status) {
		super(newname, address, phone, email);
		this.status = status;
	}
	
	public String toString() {
		return super.toString() +
               "\nClass: Student" +
			   "\nstatus: " + status;
	}
}
