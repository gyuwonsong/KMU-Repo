package shape.derived;

import shape.base.*;

public class Line extends Shape {
	
	@Override
	public void draw() {
		 System.out.println("Line");
	}
	
	@Override
	public String toString() {
		return "Line";
	}

}
