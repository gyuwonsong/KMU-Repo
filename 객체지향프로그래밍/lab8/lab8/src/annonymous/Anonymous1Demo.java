package annonymous;

public class Anonymous1Demo {
	Bird e = new Bird() {
		public void move() {
			System.out.println("�������� ����~~~.");
		}

		Bird sound() {
			System.out.println("����~~~.");
			return this;
		}
	};

	public static void main(String[] args) {
		Anonymous1Demo a = new Anonymous1Demo();
		a.e.move();
		// a.e.sound();
	}
}