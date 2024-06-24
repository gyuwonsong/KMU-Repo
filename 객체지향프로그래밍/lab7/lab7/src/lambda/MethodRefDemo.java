package lambda;

public class MethodRefDemo {
	public static void main(String[] args) {
		Showable s = System.out::println;
		// Showable s = str -> System.out.println(str);
		s.show("���־�");

		Utils u = new Utils();
		Operable o = u::add;
		// o = (x, y) -> u.add(x, y);
		System.out.println(o.operator(20, 30));

		Pickable p = String::charAt;
		// p = (x, y) -> x.charAt(y);
		System.out.println(p.pick("��������", 2));

		Newable n = String::new;
		// n = x -> new String(x);
		System.out.println(n.getString("���"));

		IntArray a = int[]::new;
		// a = x -> new int[x];
		int[] array = a.getArray(2);
		array[0] = 0;
		array[1] = 1;
	}
}