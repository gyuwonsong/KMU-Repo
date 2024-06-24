package lambda;

import java.util.Arrays;
import java.util.Comparator;

class Rectangle2 {
	private int width, height;

	public Rectangle2(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int findArea() {
		return width * height;
	}

	public String toString() {
		return "사각형[넓이=" + width + ", 높이=" + height + "]";
	}

	/*
	public int compareTo(Object o) {
		Rectangle other = (Rectangle) o;

		if (this.findArea() < other.findArea())
			return -1;
		else if (this.findArea() > other.findArea())
			return 1;
		else
			return 0;
	} */
}

public class ComparatorDemo2 {
	public static void main(String[] args) {
		Rectangle2[] rectangles = { new Rectangle2(3, 5), new Rectangle2(2, 10), new Rectangle2(5, 5) };

		Arrays.sort(rectangles, new Comparator<Rectangle2>() {
			public int compare(Rectangle2 first, Rectangle2 second) {
				if (first.findArea() < second.findArea())
					return -1;
				else if (first.findArea() > second.findArea())
					return 1;
				else
					return 0;
			}
		});

		for (Rectangle2 r : rectangles)
			System.out.println(r);
	}
}