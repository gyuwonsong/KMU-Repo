package annonymous;

class Member {
	class Eagle extends Bird {
		public void move() {
			System.out.println("�������� ����~~~.");
		}

		public void sound() {
			System.out.println("����~~~.");
		}
	}

	Eagle e = new Eagle();

}

public class MemberDemo2 {

	public static void main(String[] args) {
		Member m = new Member();
		m.e.move();
		m.e.sound();
	}
}
