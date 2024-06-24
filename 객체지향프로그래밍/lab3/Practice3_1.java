import java.util.Scanner;

public class Practice3_1 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("소문자/대문자 알파벳 하나를 입력하시오>>");
		String s = scanner.next();
		
		if(s.length() != 1) {
			System.out.print("알파벳 한글자만 입력해야 합니다!");
			scanner.close();
			return;
		}
		
		char c = s.charAt(0); //str이 가르키고 있는 문자열에서 첫 번째 글자만 char로 변환
		System.out.println("입력문자: " + c);
		
		if (!('a' <= c && c <= 'z') && !('A' <= c && c <= 'Z')) {
			System.out.println("소문자/대문자 알파벳이 아닙니다.");
			scanner.close();
			return;
		}
				
        // (실습3-1) 이 위치에 중첩-for문을 사용하여 작성
		
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
