public class JavaGrammer2_1 {

	public static void main(String[] args) {

	// (�ǽ�2-1) �Ʒ��� ������ ���Ե� ������ ������ �°� �����Ѵ�.
		
		// (1������) �ĺ��� ��� ��Ģ
		System.out.println("\n(1��) -----------------------------------------------\n");
		int hi = 3;
		double $valueNext = 5.6;
		System.out.println("hi = " + hi);
		System.out.println("$valueNext =" + $valueNext);
		
		// (2������) ����, ���ڿ�, ���ͷ�, Ű����(�����)
		System.out.println("\n(2��) -----------------------------------------------\n");
		int radius = 10;
		char c1 = '%';
		String c2 = "go";
		char c3 = (char)radius;
		String st = "Hello" + true + ", ";
		double weight = c3;
		System.out.printf("%d %c %s %c %s %f",radius, c1, c2, c3, st, weight);

		// (3������) null ����
		System.out.println("\n(3��) -----------------------------------------------\n");
		int n = 0;
		String str = null;
		System.out.println("n, str : " + n + ", " + str);

		// (4������) JDK7���� ���ڿ� ��_�� ���, ������ ���� 
		System.out.println("\n(4��) -----------------------------------------------\n");
		int price = 20_100; 
		int x = 15; 		
		double pi = 3.14; 
		System.out.println("x, pi : " + x + ", " + pi);
		System.out.println("price : " + price);
		
		// (5������) var Ű���带 ����Ͽ� ���� Ÿ�� ���� 
		System.out.println("\n(5��) -----------------------------------------------\n");
		var price1 = 200; 		// price�� int Ÿ������ ����
		var name = "����"; 		// name�� String Ÿ������ ����
		var pi1 = 3.14; 
		var val = 7;
		System.out.println("name, pi, val : " + name + ", " + pi1 + ", " + val);
		System.out.println("price1 : " + price1);
		
		// (6������) ���� Ÿ�� ��ȯ
		System.out.println("\n(6��) -----------------------------------------------\n");
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
