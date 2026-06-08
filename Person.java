package homework;

public class Person {
	
	//data
	protected String address;
	protected String name;
	protected String phone;
	protected String email;
	
	//method
	public Person() {
		
	}
	
	public Person(String name, String address, String phone, String email) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
		
	}
	
	public void setaddress(String newaddress) {
		address = newaddress;
	}
	
	public String toString() {
		return "Class: Person" +
			   "\nName: " + name +
			   "\naddress: " + address +
			   "\nphone: " + phone +
			   "\nemail: " + email;
	}
}
