import java.util.Scanner;

public class JavaGrammer2_2 {

	public static void main(String[] args) {
		
	// (�ǽ�2-2) �Ʒ��� ���ǿ� �°� ������� �ϼ��Ѵ�.
		
		// (1������) �ܼ�â�� ���� println()���� �����Ͽ� ������ ���ڿ� ���:  '�ȳ�'�� 'Hello(Hi)'��� ��!
		System.out.println("(1����) '�ȳ�'�� 'Hello(Hi)'��� ��!");
		System.out.println("\n-----------------------------------------------\n");

		
		// (2������) Scanner ����
		System.out.println("�Ʒ� 2��° ���� ������Ʈ(�Է� ���ڿ�)���� �̸�, �к�, �й�, ����, �г��� ��ĭ���� �и��Ͽ� �Է��ϼ���.");
		System.out.println("(��: ȫ�浿 ����Ʈ�����к� 20201234 20 1)");
		System.out.println("�۱Կ� ����Ʈ�����к� 20213015 20 1");
		Scanner scanner = new Scanner(System.in);
		
		//�̸� �б�
		String name = scanner.next();
		System.out.print("(2����) �̸��� " + name + ", ");
		
		//�к� �б�
		String department = scanner.next();
		System.out.print("�кδ� " + department + ", ");
		
		//�й� �б�
		int id = scanner.nextInt();
		System.out.print("�й��� " + id + ", ");

		//���� �б�
		int age = scanner.nextInt();
		System.out.print("���̴� " + age + "��, ");
		
		boolean freshman = false; //���Ի� ���� (true Ȥ�� false)
		int temp = scanner.nextInt();
		if(temp == 1)
			freshman = true;
		else
			freshman = false;
		System.out.println("���Ի� ����: " + freshman);
		System.out.println("\n-----------------------------------------------\n");
				

		// (3������) ������(/, %) ����		
		System.out.print("�ð�(����:��)�� �Է��ϼ���(��: 11000): ");
		int time = scanner.nextInt();// ���� �Է�
		int minute = time%60;		 // 60���� ���� �������� ��
		int hour = (time/60)%24;	 // 60���� ���� ���� �ٽ� 24�� ���� �������� �ð�
		int day = (time/60)/24;		 // 60���� ���� ���� �ٽ� 24�� ���� ���� ��
		
		// (��¿�) 11000���� 7�� 15�ð� 20���Դϴ�.
		System.out.print("(3����) " + time + "�� = ");
		System.out.print(day + "��, ");
		System.out.print(hour + "�ð�, ");
		System.out.println(minute + "���Դϴ�.");
		System.out.println("\n-----------------------------------------------\n");

		scanner.close();

		
		// (4������) (����,����) ������(/=, %=, ++, --) ����		
		// ���� ������(*=, %=)�� ����ϵ��� �Ʒ� 3�� ������ ǥ������ ����
		int a=3, b=3, c=3;
		a *= c;		 // a = a*c = 9
		b *= 18 / a; // b = b*18/a = 6
		c %= 2;		 // c = c%2 = 1
		System.out.println("(4-1����) a=" + a + ", b=" + b + ", c=" + c);
		System.out.println("\n-----------------------------------------------\n");

		int d=7;
		// ���� �����ڸ� ����Ͽ�, �����ϸ� 4�� ���� ���� �ڸ�Ʈ�� �ִ� ���� ��������  ǥ������ ����
		a = d--;	 // a=7, d=6
		System.out.println("(4-2����)\na=" + a + ", d=" +d);
		a = ++d;	 // a=7, d=7
		System.out.println("a=" + a + ", d=" + d);
		a = --d;	 // a=6, d=6
		System.out.println("a=" + a + ", d=" + d);
		a = d++;	 // a=6, d=7
		System.out.println("a=" + a + ", d=" + d);

	}

}
