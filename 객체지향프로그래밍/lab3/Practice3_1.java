import java.util.Scanner;

public class Practice3_1 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("�ҹ���/�빮�� ���ĺ� �ϳ��� �Է��Ͻÿ�>>");
		String s = scanner.next();
		
		if(s.length() != 1) {
			System.out.print("���ĺ� �ѱ��ڸ� �Է��ؾ� �մϴ�!");
			scanner.close();
			return;
		}
		
		char c = s.charAt(0); //str�� ����Ű�� �ִ� ���ڿ����� ù ��° ���ڸ� char�� ��ȯ
		System.out.println("�Է¹���: " + c);
		
		if (!('a' <= c && c <= 'z') && !('A' <= c && c <= 'Z')) {
			System.out.println("�ҹ���/�빮�� ���ĺ��� �ƴմϴ�.");
			scanner.close();
			return;
		}
				
        // (�ǽ�3-1) �� ��ġ�� ��ø-for���� ����Ͽ� �ۼ�
		
		if ('a'<=c && c<='z') {
			for (char i=c ; i>='a' ; i--) {
				for (char j='a' ; j<=i ; j++) {
					System.out.print(j);
				}
				System.out.println();
		}
		}
		
		if ('A'<=c && c<='Z') {
			for (char i=c ; i>='A' ; i--) {
				for (char j='A' ; j<=i ; j++) {
					System.out.print(j);
				}
				System.out.println();
		}
		}
		
		scanner.close();
	}
}
