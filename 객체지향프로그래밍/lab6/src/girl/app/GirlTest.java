package girl.app;

import girl.base.*;
import girl.derived.*;

public class GirlTest {
	public static void main(String[] args) {
		
		Girl[] girls = { new Girl("°©¼øÀÌ"), new GoodGirl("ÄáÁã"), new BestGirl("È²ÁøÀÌ") };

		for (Girl g : girls)
			g.show();
	}
}