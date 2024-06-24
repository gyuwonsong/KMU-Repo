package tokenize;

import java.util.Arrays;
import java.util.Scanner;

public class StringTokenizerTest {
	public static void main(String[] args) {
		System.out.println("문자열을 입력하세요. 빈 칸이나 있어도 되고 영어 한글 모두 됩니다.");
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		
		// (예1)  Empty vessels make the most sound.
		// (예2)  Hello, there!!! How are you, today?
		// (예3)  안녕!!! 오늘 날씨가 어때?
		// (실습6-3) 구현 위치
		
		System.out.println("입력문자열 : " + text);
		text = text.replace("." , "");
		text = text.replace("," , "");
		text = text.replace("!" , "");
		text = text.replace("?" , "");
		String[] array = text.split(" ");
		int word = array.length;
		
		System.out.println("단어 개수 : " + word);
		System.out.print("입력순 토큰 :");
		for (int i = 0; i<array.length; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println();
		Arrays.sort(array);
		System.out.print("정렬된 토큰 :");
		for (int i = 0; i<array.length; i++) {
			System.out.print(array[i] + ", ");
		} 
		
		scanner.close();
	}
}