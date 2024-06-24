import java.util.Scanner;

public class JavaGrammer2_3 {

	public static void main(String[] args) {
		
	// (실습2-3) 아래의 조건에 맞게 문장들을 완성한다.
		

		// (1번문제) 나이가 20-29살 범위에 있으면 true, 아니면 false를 출력하도록
        //         아래 출력문의 "?" 를 수정함
		Scanner scanner = new Scanner(System.in);		
		System.out.print("나이를 입력하세요(예: 21): ");
		int age = scanner.nextInt(); 		// 정수 입력



		//System.out.println("나이가 20-29살 입니다: " + 20 <= age < 30 );
		System.out.println("(1번답) 나이가 20-29살 입니다: "  + ((20 <= age) && (age < 30)));
		System.out.println("\n-----------------------------------------------\n");

		

		// (2번문제) 나이가 20-29살 범위에 있으면 "예", 아니면 "아니오"를 출력하도록
		//         아래의 문장(변수 answer값을 설정하는 문장)을 조건연산자 사용 표현식으로 완성하라.
		System.out.print("나이를 입력하세요(예: 21): ");
		age = scanner.nextInt(); 
        String answer = ((20 <= age) && (age < 30))? "예" : "아니오"; // "?" 부분을 조건연산자 표현식으로 구현함
		System.out.println("(2번답) 나이가 20-29살 입니다: " + answer );
		System.out.println("\n-----------------------------------------------\n");



		// (3번문제) 나이가 20-29살 범위에 있으면 "예", 아니면 "아니오"를 출력하도록
		//          아래의 문장(변수 answer값을 설정하는 문장)을 삼항연산자를 사용하여 완성하라.
		System.out.print("나이를 입력하세요(예: 21): ");
		age = scanner.nextInt(); 
		answer = ((20 <= age) && (age < 30))? "예" : "아니오"; // "?" 부분을 삼항연산자로 구현
		System.out.println("(3번답) 나이가 20-29살 입니다: " + answer );
		System.out.println("\n-----------------------------------------------\n");



		// (4번문제) 운전면허 필기시험 점수, 면허정지 후 재시험여부,  면허취소 후 재시험여부 로
		//          합격이 결정되도록 규정이 바뀌었다. 
		//          일반적인 경우, 70점 이상이면 "합격"
		//          단, 면허정지 후 재시험인 경우, 80점 이상이 "합격"
		//          단, 면허취소 후 재시험인 경우, 90점 이상이 "합격"
		//          나머지 경우는 "불합격" 이 출력된다.
		//          switch문을 사용해서 다음 문장들을 완성하라.

		System.out.print("점수를 입력하세요(0~100): ");
		int score = scanner.nextInt(); 

		System.out.print("면허상태를 입력하세요(1~3) (1:정상,2:면허정지,3:면허취소): ");
		int status = scanner.nextInt();
		
		System.out.printf("(5번답) ");
		switch(score/10) {
		case 10 : case 9:
			System.out.println("합격");
			break;
		case 8:
			if(status != 3)
				System.out.println("합격");
			else
				System.out.println("불합격");
			break;
		case 7:
			if(status != 3 && status != 2)
				System.out.println("합격");
			else
				System.out.println("불합격");
			break;
		default:
			System.out.println("불합격");
			break;
		}
		scanner.close();
	}

}