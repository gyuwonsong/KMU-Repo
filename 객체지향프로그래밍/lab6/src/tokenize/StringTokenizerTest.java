package tokenize;

import java.util.Arrays;
import java.util.Scanner;

public class StringTokenizerTest {
	public static void main(String[] args) {
		System.out.println("���ڿ��� �Է��ϼ���. �� ĭ�̳� �־ �ǰ� ���� �ѱ� ��� �˴ϴ�.");
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		
		// (��1)  Empty vessels make the most sound.
		// (��2)  Hello, there!!! How are you, today?
		// (��3)  �ȳ�!!! ���� ������ �?
		// (�ǽ�6-3) ���� ��ġ
		
		System.out.println("�Է¹��ڿ� : " + text);
		text = text.replace("." , "");
		text = text.replace("," , "");
		text = text.replace("!" , "");
		text = text.replace("?" , "");
		String[] array = text.split(" ");
		int word = array.length;
		
		System.out.println("�ܾ� ���� : " + word);
		System.out.print("�Է¼� ��ū :");
		for (int i = 0; i<array.length; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println();
		Arrays.sort(array);
		System.out.print("���ĵ� ��ū :");
		for (int i = 0; i<array.length; i++) {
			System.out.print(array[i] + ", ");
		} 
		
		scanner.close();
	}
}