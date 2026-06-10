package homework;

public class HW3_Fan {
	
	// Constants
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;

    // Data fields
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    String color = "blue";

    // No-arg constructor
    HW3_Fan() {

    }
    
    // Accessor methods

    int getSpeed() {
        return speed;

    }

    boolean getOn() {
        return on;
    }

    double getRadius() {
        return radius;
    }

    String getColor() {
        return color;
    }

    // Mutator methods

    void setSpeed(int speed) {
        this.speed = speed;
    }

    void setOn(boolean on) {
        this.on = on;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }

    void setColor(String color) {
        this.color = color;
    }

    // toString method
    public String toString() {
        if (on == true) {
            return "Fan speed: " + speed +
                   ", Color: " + color +
                   ", Radius: " + radius;
        }
        else {
            return "Fan color: " + color +
                   ", Radius: " + radius +
                   ", Fan is off";
        }

    }

}
