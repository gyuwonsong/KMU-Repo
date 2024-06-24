package shape.base;

public abstract class Shape {
	private Shape next;
	public Shape() { next = null;}
	public void setNext(Shape obj) {next = obj;} // ��ũ ����
	public Shape getNext() {return next;}
	public abstract void draw();
}
