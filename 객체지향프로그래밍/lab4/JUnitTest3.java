// Juice

import static org.junit.Assert.*;
import org.junit.Test;

public class JUnitTest3 {
    @Test
    public void test() {
        Juice j1 = new Juice();
        Juice j2 = new Juice(3, "¸À¾ø´Â¸À");
        assertTrue(j1.getFlavor().equals("¿À·»Áö"));
        assertTrue(j2.getFlavor().equals("¸À¾ø´Â¸À"));
	        
        j1.setFlavor("¸ÀÀÖ´Â¸À");
        assertTrue(j1.getFlavor().equals("¸ÀÀÖ´Â¸À"));
    }
}	
