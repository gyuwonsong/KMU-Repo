package shape.derived;

import shape.base.*;

public class Circle extends Shape {
	
	@Override
	public void draw() {
		 System.out.println("Circle");
	}
	
	@Override
	public String toString() {
		return "Circle";
	}

}
