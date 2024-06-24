package shape.test;

import java.util.Scanner;
import java.util.Vector;
import shape.base.*;
import shape.derived.*;

public class ShapeTest {
	private String name;
	private Scanner scanner = new Scanner(System.in);
	private Vector<Shape> v = new Vector<Shape>();
	
	public ShapeTest(String name) {
		this.name = name;
	}

/*
 * (Test Senario)
 * 
 *   Run the graphic editor <GE-v.1> ...
 *   insert(1), remove(2), show all members(3), finish(4)>> 1
 *   Line(1), Rect(2), Circle(3)>> 2
 *   insert(1), remove(2), show all members(3), finish(4)>> 1
 *   Line(1), Rect(2), Circle(3)>> 3
 *   insert(1), remove(2), show all members(3), finish(4)>> 1
 *   Line(1), Rect(2), Circle(3)>> 4
 *   wrong graphic type!
 *   insert(1), remove(2), show all members(3), finish(4)>> 5
 *   wrong request!
 *   insert(1), remove(2), show all members(3), finish(4)>> 1
 *   Line(1), Rect(2), Circle(3)>> 1
 *   insert(1), remove(2), show all members(3), finish(4)>> 3
 *   Rect
 *   Circle
 *   Line
 *   insert(1), remove(2), show all members(3), finish(4)>> 2
 * 	 index location of the Shape to be removed >> 3
 *   cannot remove it!
 *   insert(1), remove(2), show all members(3), finish(4)>> 2
 *   index location of the Shape to be removed >> 1
 *   insert(1), remove(2), show all members(3), finish(4)>> 3
 *   Rect
 *   Line   
 *   insert(1), remove(2), show all members(3), finish(4)>> 4
 *   finish the graphic editor <GE-v.1>
 *   
 */
	
	public void run() {
		System.out.println("Run the graphic editor " + name + " ...");
		int choice = 0;
		while (choice != 4) { 
			int type, index;
			System.out.print("insert(1), remove(2), show all members(3), finish(4)>> ");
			choice = scanner.nextInt();
			switch (choice) {
				case 1:	// insert a Shape at index location of the list(Vector v)
					System.out.print("Line(1), Rect(2), Circle(3)>> ");
					type = scanner.nextInt();
					if (type < 1 || type > 3) {
						System.out.println("wrong graphic type!");
						break;
					}
					insert(type);
					break;
				case 2:	// remove a Shape at index location of the list(Vector v)
					System.out.print("index location of the Shape to be removed >> ");
					index = scanner.nextInt();
					if (!delete(index)) {
						System.out.println("cannot remove it!");
					}
					break;
				case 3:	// show all Shapes stored in list(Vector v) by calling draw() method
					view();
					break;
				case 4:	// finish the program execution
					break;
				default:
					System.out.println("wrong request!");
			}
		}
		System.out.println("finish the graphic editor " + name);	
	}

	private void view() {
		
		// (lab7_1) (1) show all Shapes stored in list(Vector v) by calling draw() method here
		for(int i=0; i<v.size(); i++) v.get(i).draw();
		
	}
	
	private boolean delete(int index) {
		
		// (lab7_1) (2) remove a Shape at index location of the list(Vector v)
		if (v.size() == 0 || index >= v.size()) // 리스트가 비거나, 인덱스에 도형이 없는 경우
			return false;
		v.remove(index);
		return true;
	}

	private void insert(int choice) {
		Shape shape=null;
		
		// (lab7_1) (3)  insert the chosen Shape at index location of the list(Vector v)
		switch (choice) {
		case 1: // Line
			shape = new Line();
			 break;
		case 2: // Rect
			shape = new Rect();
			break;
		case 3: // Circle
			shape = new Circle();
	}
	v.add(shape);
		
	}
	
	public static void main(String [] args) {
		ShapeTest ge = new ShapeTest(" <GE-v.1>");
		ge.run();
	}
}
