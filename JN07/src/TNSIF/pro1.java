package TNSIF;

public class pro1 {
	private float x,y;
	
	//Default Constructor
	public  pro1() {
		x = 0.0f;
		y = 0.0f;
	}
	
	//constructor with single parameter
	public pro1(float value) {
		x = value;
		y = value;
	}
	//constructor with two parameter
	public pro1 (float a, float b) {
		x =a;
		y = b;
	}
	//method to display the coordinates
	public void display() {
        System.out.println("Point is  (" + x + ", " + y + ")");
        //System.out.println(y);
	}
     
}
