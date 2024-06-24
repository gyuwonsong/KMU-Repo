package annonymous;

public class Anonymous1Demo {
	Bird e = new Bird() {
		public void move() {
			System.out.println("독수리가 난다~~~.");
		}

		Bird sound() {
			System.out.println("휘익~~~.");
			return this;
		}
	};

	public static void main(String[] args) {
		Anonymous1Demo a = new Anonymous1Demo();
		a.e.move();
		// a.e.sound();
	}
}