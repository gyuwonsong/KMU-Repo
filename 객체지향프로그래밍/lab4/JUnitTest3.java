// Juice

import static org.junit.Assert.*;
import org.junit.Test;

public class JUnitTest3 {
    @Test
    public void test() {
        Juice j1 = new Juice();
        Juice j2 = new Juice(3, "�����¸�");
        assertTrue(j1.getFlavor().equals("������"));
        assertTrue(j2.getFlavor().equals("�����¸�"));
	        
        j1.setFlavor("���ִ¸�");
        assertTrue(j1.getFlavor().equals("���ִ¸�"));
    }
}	
