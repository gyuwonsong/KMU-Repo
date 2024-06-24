package phone;

class Phone {
	
	protected String owner;
	
	Phone(String owner) {
		this.owner = owner;
	}
	
	void talk() {
		System.out.println(owner + "�� ��ȭ ���̴�.");
	}
}

class Telephone extends Phone {
	
	private String when;
	
	Telephone(String owner, String when) {
		super(owner);
		this.when = when;
	}
	
	void autoAnswering() {
		System.out.println(owner + "�� ����. " + when + " ��ȭ �ٷ�.");
	}
}

class Smartphone extends Telephone {
	
	private String game;
	
	Smartphone(String owner, String game) {
		super(owner, "when");
		this.game = game;
	}
	
	void playGame() {
		System.out.println(owner + "�� " + game + " ������ �ϴ� ���̴�.");
	}
}

public class PhoneTest {
	public static void main(String[] args) {
		Phone[] phones = { new Phone("Ȳ����"), new Telephone("�浿��", "����"), new Smartphone("�α���", "������") };

		for (Phone phone : phones){
			if (phone instanceof Smartphone) {
				((Smartphone) phone).playGame();
			}
			else if (phone instanceof Telephone) {
				((Telephone) phone).autoAnswering();
			}
			else if (phone instanceof Phone) {
				phone.talk();
			}
		}	
	}
}