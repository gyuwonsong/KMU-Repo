public class JavaGrammer2_1 {

	public static void main(String[] args) {

	// (실습2-1) 아래의 에러가 포함된 문장을 문법에 맞게 수정한다.
		
		// (1번문제) 식별자 명명 규칙
		System.out.println("\n(1번) -----------------------------------------------\n");
		int hi = 3;
		double $valueNext = 5.6;
		System.out.println("hi = " + hi);
		System.out.println("$valueNext =" + $valueNext);
		
		// (2번문제) 문자, 문자열, 리터럴, 키워드(예약어)
		System.out.println("\n(2번) -----------------------------------------------\n");
		int radius = 10;
		char c1 = '%';
		String c2 = "go";
		char c3 = (char)radius;
		String st = "Hello" + true + ", ";
		double weight = c3;
		System.out.printf("%d %c %s %c %s %f",radius, c1, c2, c3, st, weight);

		// (3번문제) null 규정
		System.out.println("\n(3번) -----------------------------------------------\n");
		int n = 0;
		String str = null;
		System.out.println("n, str : " + n + ", " + str);

		// (4번문제) JDK7부터 숫자에 ‘_’ 허용, 가독성 높임 
		System.out.println("\n(4번) -----------------------------------------------\n");
		int price = 20_100; 
		int x = 15; 		
		double pi = 3.14; 
		System.out.println("x, pi : " + x + ", " + pi);
		System.out.println("price : " + price);
		
		// (5번문제) var 키워드를 사용하여 변수 타입 생략 
		System.out.println("\n(5번) -----------------------------------------------\n");
		var price1 = 200; 		// price는 int 타입으로 결정
		var name = "영수"; 		// name은 String 타입으로 결정
		var pi1 = 3.14; 
		var val = 7;
		System.out.println("name, pi, val : " + name + ", " + pi1 + ", " + val);
		System.out.println("price1 : " + price1);
		
		// (6번문제) 강제 타입 변환
		System.out.println("\n(6번) -----------------------------------------------\n");
		int i = 1000000;
		short d;
		double s = 3.14;
		byte a;
		d = (short)i;
		a = (byte)s;
		System.out.println("i, s = " + i + ", " + s);
		System.out.println("d, a = " + d + ", " + a);
				
	}

}
