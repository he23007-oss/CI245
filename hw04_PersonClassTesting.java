package homework;

public class hw04_PersonClassTesting {

	public static void main(String[] args) {
		//create and display person
		Person p1 = new Person();
		Person p2 = new Person("Smith", "203 N broadway", "293-295-5870", "Sm234@gmail.com");
		System.out.println(p1);
		System.out.println(p2);
		
		Employee e1 = new Employee("alex", "234 f sert", "493-496-0093", "al555@gmail.com", 39000, "w303");
		System.out.println(e1);

		Student s1 = new Student("joe", "209 s west", "384-284-2245", "jo059@gmail.com", 1);
		System.out.println(s1);

		Faculty f1 = new Faculty("ed", "576 s more", "230-583-5907", "ed996@gmail.com", "Mon-Thu, 10:00AM - 4:00PM", "PROF");
		System.out.println(f1);
	}

}
