import java.util.Scanner;

public class JavaGrammer2_3 {

	public static void main(String[] args) {
		
	// (�ǽ�2-3) �Ʒ��� ���ǿ� �°� ������� �ϼ��Ѵ�.
		

		// (1������) ���̰� 20-29�� ������ ������ true, �ƴϸ� false�� ����ϵ���
        //         �Ʒ� ��¹��� "?" �� ������
		Scanner scanner = new Scanner(System.in);		
		System.out.print("���̸� �Է��ϼ���(��: 21): ");
		int age = scanner.nextInt(); 		// ���� �Է�



		//System.out.println("���̰� 20-29�� �Դϴ�: " + 20 <= age < 30 );
		System.out.println("(1����) ���̰� 20-29�� �Դϴ�: "  + ((20 <= age) && (age < 30)));
		System.out.println("\n-----------------------------------------------\n");

		

		// (2������) ���̰� 20-29�� ������ ������ "��", �ƴϸ� "�ƴϿ�"�� ����ϵ���
		//         �Ʒ��� ����(���� answer���� �����ϴ� ����)�� ���ǿ����� ��� ǥ�������� �ϼ��϶�.
		System.out.print("���̸� �Է��ϼ���(��: 21): ");
		age = scanner.nextInt(); 
        String answer = ((20 <= age) && (age < 30))? "��" : "�ƴϿ�"; // "?" �κ��� ���ǿ����� ǥ�������� ������
		System.out.println("(2����) ���̰� 20-29�� �Դϴ�: " + answer );
		System.out.println("\n-----------------------------------------------\n");



		// (3������) ���̰� 20-29�� ������ ������ "��", �ƴϸ� "�ƴϿ�"�� ����ϵ���
		//          �Ʒ��� ����(���� answer���� �����ϴ� ����)�� ���׿����ڸ� ����Ͽ� �ϼ��϶�.
		System.out.print("���̸� �Է��ϼ���(��: 21): ");
		age = scanner.nextInt(); 
		answer = ((20 <= age) && (age < 30))? "��" : "�ƴϿ�"; // "?" �κ��� ���׿����ڷ� ����
		System.out.println("(3����) ���̰� 20-29�� �Դϴ�: " + answer );
		System.out.println("\n-----------------------------------------------\n");



		// (4������) �������� �ʱ���� ����, �������� �� ����迩��,  ������� �� ����迩�� ��
		//          �հ��� �����ǵ��� ������ �ٲ����. 
		//          �Ϲ����� ���, 70�� �̻��̸� "�հ�"
		//          ��, �������� �� ������� ���, 80�� �̻��� "�հ�"
		//          ��, ������� �� ������� ���, 90�� �̻��� "�հ�"
		//          ������ ���� "���հ�" �� ��µȴ�.
		//          switch���� ����ؼ� ���� ������� �ϼ��϶�.

		System.out.print("������ �Է��ϼ���(0~100): ");
		int score = scanner.nextInt(); 

		System.out.print("������¸� �Է��ϼ���(1~3) (1:����,2:��������,3:�������): ");
		int status = scanner.nextInt();
		
		System.out.printf("(5����) ");
		switch(score/10) {
		case 10 : case 9:
			System.out.println("�հ�");
			break;
		case 8:
			if(status != 3)
				System.out.println("�հ�");
			else
				System.out.println("���հ�");
			break;
		case 7:
			if(status != 3 && status != 2)
				System.out.println("�հ�");
			else
				System.out.println("���հ�");
			break;
		default:
			System.out.println("���հ�");
			break;
		}
		scanner.close();
	}

}