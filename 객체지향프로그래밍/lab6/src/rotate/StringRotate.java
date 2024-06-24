package rotate;

import java.util.Scanner;

public class StringRotate {

	public static void main(String[] args) {
		System.out.println("문자열을 입력하세요. 빈 칸이나 있어도 되고 영어 한글 모두 됩니다.");
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		StringBuffer sb = new StringBuffer(text);
		int len = text.length();
		String[] array = text.split("");
		
		System.out.println("\n(왼쪽 이동)"); // 예:Hello, there?
		// (왼쪽 이동)을 위한 반복문 구현 위치
		
		System.out.println(sb);
		for (int j = 0; j<len; j++) {
			sb.insert(len, array[j]);
			sb.delete(0, 1);
			System.out.println(sb);
		}
		
		System.out.println("\n(오른쪽 이동)");
		// (오른쪽 이동)을 위한 반복문 구현 위치

		System.out.println(sb);
		for (int j = len-1; j>=0; j--) {
			sb.insert(0, array[j]);
			sb.delete(len, len+1);
			System.out.println(sb);
		}
		
		scanner.close();
	}
}