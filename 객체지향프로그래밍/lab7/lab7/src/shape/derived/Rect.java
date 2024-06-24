package shape.derived;

import shape.base.*;

public class Rect extends Shape {

	@Override
	public void draw() {
		 System.out.println("Rect");
	}
	
	@Override
	public String toString() {
		return "Rect";
	}

}
