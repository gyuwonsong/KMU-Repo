package rotate;

import java.util.Scanner;

public class StringRotate {

	public static void main(String[] args) {
		System.out.println("���ڿ��� �Է��ϼ���. �� ĭ�̳� �־ �ǰ� ���� �ѱ� ��� �˴ϴ�.");
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		StringBuffer sb = new StringBuffer(text);
		int len = text.length();
		String[] array = text.split("");
		
		System.out.println("\n(���� �̵�)"); // ��:Hello, there?
		// (���� �̵�)�� ���� �ݺ��� ���� ��ġ
		
		System.out.println(sb);
		for (int j = 0; j<len; j++) {
			sb.insert(len, array[j]);
			sb.delete(0, 1);
			System.out.println(sb);
		}
		
		System.out.println("\n(������ �̵�)");
		// (������ �̵�)�� ���� �ݺ��� ���� ��ġ

		System.out.println(sb);
		for (int j = len-1; j>=0; j--) {
			sb.insert(0, array[j]);
			sb.delete(len, len+1);
			System.out.println(sb);
		}
		
		scanner.close();
	}
}