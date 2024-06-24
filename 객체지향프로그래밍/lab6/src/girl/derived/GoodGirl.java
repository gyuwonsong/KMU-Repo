package girl.derived;

import girl.base.Girl;

public class GoodGirl extends Girl {

	public GoodGirl(String name) {
		super(name);
	}

	public void show() {
		System.out.println(name + "는 자바를 잘 안다.");
	}
}