package girl.app;

import girl.base.*;
import girl.derived.*;

public class GirlTest {
	public static void main(String[] args) {
		
		Girl[] girls = { new Girl("������"), new GoodGirl("����"), new BestGirl("Ȳ����") };

		for (Girl g : girls)
			g.show();
	}
}