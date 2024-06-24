package lambda;

interface Negative {
	int neg(int x);
}

public class Lambda2Demo {
	public static void main(String[] args) {
		Negative n;
		
		n = (int x) -> {
			return -x;
		};
		
		n = (x) -> {
			return -x;
		};
		
		n = x -> {
			return -x;
		};
		
		n = (int x) -> -x;
		
		n = (x) -> -x;
		
		n = x -> -x;
		
		int x = n.neg(-5);
		System.out.println("x = " + x);
		
	}
}