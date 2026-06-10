package homework;

public class HW3_Fan_Test {

	public static void main(String[] args) {	

	//Fan object

	HW3_Fan fan1 = new HW3_Fan();
	fan1.setSpeed(fan1.FAST);
	fan1.setRadius(5);
	fan1.setColor("Red");
	fan1.setOn(true);

    // Second fan object

	HW3_Fan fan2 = new HW3_Fan();
    fan2.setSpeed(fan2.MEDIUM);
    fan2.setRadius(5);
    fan2.setColor("Blue");
    fan2.setOn(false);

    // Display objects

    System.out.println(fan1.toString());
    System.out.println("===============");
    System.out.println(fan2.toString());

 		}

	}
