package annonymous;

public class Anonymous1Demo2 {
	Bird e = (new Bird() {
		public void move() {
			System.out.println("�������� ����~~~.");
		}

		Bird sound() {
			System.out.println("����~~~.");
			return this;
		}
	}).sound();

	public static void main(String[] args) {
		Anonymous1Demo2 a = new Anonymous1Demo2();
		a.e.move();
		// a.e.sound();
	}
}